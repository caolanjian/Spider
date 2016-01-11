import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import javax.imageio.ImageIO;

import com.clj.dao.services.ArticleService;
import com.clj.dao.services.SubjectService;
import com.clj.daoUtil.DaoUtil;
import com.clj.daoUtil.HibernateDaoUtil;
import com.clj.domain.Article;
import com.clj.domain.Articlecontent;
import com.clj.domain.Articlesubject;
import com.clj.domain.Historyurl;
import com.clj.domain.Keywords;
import com.clj.domain.Subject;
import com.clj.exceptions.IsNotDirectoryException;
import com.clj.httpUtils.DownloaderUtil;
import com.clj.httpUtils.FileLogHelper;
import com.clj.httpUtils.ImageHelper;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

public class ArticleStorePipeline implements Pipeline{

	public static String SERVER_IP = "http://10.185.50.234:81";
	public static String IMAGE_SERVER_NAME = "/GoBodyImgServer/img/";
	public static String imagePath = "C:/Apache/htdocs/GoBodyImgServer/img/";
	private File pictureStorePath;
	private DaoUtil daoTool;
	private String path;
	
	public ArticleStorePipeline(String path) throws IsNotDirectoryException
	{
		pictureStorePath = new File(path);
		daoTool = new HibernateDaoUtil();
		this.path = path;
		if(pictureStorePath.isDirectory())
		{
			if(!pictureStorePath.exists())
			{
				pictureStorePath.mkdir();
			}
			else
			{
				//keep this folder
			}
		}
		else
		{
			throw new IsNotDirectoryException(path + " is not a directory");
		}
	}
	
	public String getSuffixFromUrl(String url)
	{
		String suffix = null;
		if(url.indexOf("?")!=-1)
		{
			String subParas = url.substring(url.indexOf("?") + 1);
			String[] paras = subParas.split("&");
			for(String para : paras)
			{
				if(para.indexOf("wx_fmt=")!=-1)
				{
					suffix = para.substring(para.indexOf("=")+1);
					break;
				}
			}
		}
		else
		{
			String lastSubUrl = url.substring(url.lastIndexOf("/") + 1);
			if(lastSubUrl.indexOf(".") != -1)
			{
				suffix = lastSubUrl.substring(lastSubUrl.lastIndexOf(".") + 1);
			}
		}

		if(suffix == null || suffix.equals(""))
		{
			suffix = "jpg";
		}
		
		return suffix;
	}
	
	public boolean checkImageValid(String imagePath)
	{
		File file = new File(imagePath);
		try
		{
			FileInputStream fis = new FileInputStream(file);
			BufferedImage bufferedImg = ImageIO.read(fis);
			int imgWidth = bufferedImg.getWidth();
			int imgHeight = bufferedImg.getHeight();
			if(imgWidth < 200 || imgHeight < 200 || imgWidth/imgHeight>2 || imgHeight/imgWidth>2)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		catch(Exception e)
		{
			return true;
		}
		
	}
	
	public void process(ResultItems resultItems, Task task) {
		// TODO Auto-generated method stub
		ArticleCrawled articleCrawled = (ArticleCrawled)resultItems.get("article");
		if(articleCrawled == null)
		{
			return;
		}
		
		String title = articleCrawled.getTitle();
		String url = articleCrawled.getUrl();
		String articleAbstract = articleCrawled.getArticleAbstract();
		String img1 = "";
		String img2 = "";
		String img3 = "";
		String articleCreateTime = articleCrawled.getArticleCreateTime();
		String author = articleCrawled.getAuthor();
		List<String> keywords = articleCrawled.getKeywords();
		List<String> articleContent = articleCrawled.getArticleContent();
		
		//剔除重复内容
		List<Article> temp = (List<Article>)daoTool.queryBySql("from Article where title=?", title);
		if(temp != null && temp.size() > 0)
		{
			return;
		}

		//剔除内容为空的文章
		if(articleContent == null)
		{
			return;
		}
		if(articleContent.size() <= 0)
		{
			return;
		}
		
		//1. create a Article Domain
		Article articleInDB = new Article();
		
		//2. create a id, create a folder to store img for article
		String id = UUID.randomUUID().toString();
		articleInDB.setArticleid(id);
		
		String imgSubFolder = id + "/";
		String articleImgFolder = path + imgSubFolder;
		File f = new File(articleImgFolder);
		f.mkdir();
	
		//4. generate articleCreateTime
		if(articleCreateTime != null)
		{
			Long date = (new Date()).getTime();

			articleInDB.setCreatetime(date);
		}
		
		//5. set title, url, abstract_, author, subject
		articleInDB.setTitle(title);
		articleInDB.setUrl(url);
		articleInDB.setAbstract_(articleAbstract);
		articleInDB.setAuthor(author);
		articleInDB.setSupportnum(0);
		
		//6. generate content

		Articlecontent content = new Articlecontent(articleInDB,  "");
		if(articleContent != null)
		{
			StringBuffer contentString = new StringBuffer("");
			for(String contentLine : articleContent)
			{
				if(contentLine.startsWith("<br"))
				{
					contentString.append("\n");
				}
				else if(contentLine.startsWith("<img>"))
				{
					//1. 获取图片url地址
					String imgUrl = contentLine.substring(contentLine.indexOf("<img>") + "<img>".length(), 
																		contentLine.indexOf("</img>"));
					
					int downloadResult = -1;
					//2. 初始化下载文件名和resize文件名
					String suffix = getSuffixFromUrl(imgUrl);
					String lineImgFileName = UUID.randomUUID().toString();
					String imageName = lineImgFileName + "." + suffix;
					String reSizeImageName = lineImgFileName + "_resize." + suffix;
					
					//3. 下载图片
					downloadResult = DownloaderUtil.downloadFile(imgUrl, 
												articleImgFolder, 
												imageName);
					if(downloadResult != -1 && checkImageValid(articleImgFolder + imageName))
					{
						String finalImageName = imageName;
						//4、如果下载成功，resiz图片
/*						try 
						{
							ImageHelper.saveImageAsJpg(articleImgFolder + imageName, 
									                   articleImgFolder + reSizeImageName, 
									                   500, 0, false);
							//5. resize后删除原图
							File file = new File(articleImgFolder + imageName);
							file.delete();
							finalImageName = reSizeImageName;
						} 
						catch (Exception e) 
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
							finalImageName = imageName;
							FileLogHelper.writeLog(articleImgFolder + imageName);
						}*/
						/*set img sever url*/
						String imgServerUrl = SERVER_IP+IMAGE_SERVER_NAME;
						String urlPath = imgSubFolder + finalImageName;
						contentString.append("<img>" + imgServerUrl + urlPath + "</img>" + "\n");
						if("".equals(img1))
						{
							img1 = imgServerUrl + urlPath;
						}
						else if("".equals(img2))
						{
							img2 = imgServerUrl + urlPath;
						}
						else if("".equals(img3))
						{
							img3 = imgServerUrl + urlPath;
						}
					}
				}
				else if(contentLine.startsWith("<iframe>"))
				{
					contentString.append(contentLine);
					contentString.append("\n");
				}
				else
				{
					contentString.append(contentLine);
					contentString.append("\n");
				}
			}
			content.setContent(contentString.toString());
		}
		
		//7. add Articlecontent into DB, Article will be add into DB auto
		articleInDB.setImg1(img1);
		articleInDB.setImg2(img2);
		articleInDB.setImg3(img3);
		
		//8. add Subject
		String subject = "健身";
		SubjectService ss = new SubjectService();
		HashSet<Articlesubject> subjects = new HashSet<Articlesubject>();
		for(String subjectKey : HaoKooFilter.subjectFilter.keySet())
		{
			String[] autherFilter = HaoKooFilter.subjectFilter.get(subjectKey);
			for(String autherStr : autherFilter)
			{
				if(autherStr.indexOf(author) != -1)
				{
					subject = subjectKey;
					Subject subjectInDB = ss.getSubjectByName(subject);
					Articlesubject articleSubject = new Articlesubject();
					articleSubject.setArticle(articleInDB);
					articleSubject.setSubject(subjectInDB);
					subjects.add(articleSubject);
					break;
				}
			}
		}
		
		ArticleService articleService = new ArticleService();
		articleService.saveArticleAndContentAndSubjectCascade(articleInDB, content, subjects);
		
		//8. update keywords table
		if(keywords != null)
		{
			for(String keyword : keywords)
			{
				String sql = "from Keywords where keyword='" + keyword + "'";
				List<Keywords> keywordList = (List<Keywords>)daoTool.queryBySql(sql, new HashMap());
				if(keywordList!=null && !keywordList.isEmpty())
				{
					//update
					Keywords tempword = keywordList.get(0);
					tempword.setArticleIds(tempword.getArticleIds() + "," + id);
					daoTool.updateObject(tempword);
				}
				else
				{
					//add a new keyword
					Keywords tempword = new Keywords(keyword, id);
					daoTool.addObject(tempword);
					
				}
			}
		}
		
		//9. save the url into the history Url
		Historyurl historyUrl = new Historyurl(url);
		daoTool.addObject(historyUrl);
	}

}

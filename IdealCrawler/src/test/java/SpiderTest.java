import java.io.IOException;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import com.clj.exceptions.IsNotDirectoryException;
import com.clj.httpUtils.FileLogHelper;

import us.codecraft.webmagic.Spider;

public class SpiderTest extends TimerTask{
	
	private static Spider spider;
	
	private SpiderTest()
	{
	}
	
	public static boolean checkSpiderNull()
	{
		if(spider == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void setSpider2Null()
	{
		spider = null;
	}
	
	public static Spider getInstance() throws IsNotDirectoryException
	{
		if(spider == null)
		{
			int threadNum = 0;
			spider = Spider.create(new HooKooPageProcessor())
					  .addPipeline(new ArticleStorePipeline(ArticleStorePipeline.imagePath));
			
			Set<String> keySet = HaoKooFilter.authorsInitUrl.keySet();
			for(String author : keySet)
			{
				String url = HaoKooFilter.authorsInitUrl.get(author);
				if(url!=null && !"".equals(url))
				{
					spider = spider.addUrl(url);
					threadNum++;
				}
			}
			spider.thread(threadNum);
		}
		return spider;
	}
	
	public void startSpider() throws IsNotDirectoryException
	{
		SpiderTest.getInstance().start();
	}
	
	public void stopSpider() throws IsNotDirectoryException
	{
		if(SpiderTest.checkSpiderNull() == false)
		{
			SpiderTest.getInstance().stop();
			SpiderTest.setSpider2Null();
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		FileLogHelper.writeLog("#############Spider Restart##############");
		try 
		{
			stopSpider();
			Thread.sleep(5000);
			startSpider();
		} 
		catch (IsNotDirectoryException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		long runTime = 1000 * 60 * 60 * 12;
		
		Timer timer = new Timer();
		timer.schedule(new SpiderTest(), 0, runTime);
	}

	
}

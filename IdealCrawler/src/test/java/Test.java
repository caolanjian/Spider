import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.clj.httpUtils.FileLogHelper;
import com.clj.httpUtils.ImageHelper;


public class Test {

	
	public static void main(String[] args) throws Exception
	{
		String sourcePath = "C:/Apache/htdocs/GoBodyImgServer/img/7c33e60e-d855-4be4-9050-fa6f4a918fcb/847bec20-efd1-4d2e-8228-e94ca9a8f07f.jpg";
		String targetPath = "C:/Apache/htdocs/GoBodyImgServer/img/7c33e60e-d855-4be4-9050-fa6f4a918fcb/847bec20-efd1-4d2e-8228-e94ca9a8f07f_resize.jpg";
		//BufferedImage sourceImage = ImageIO.read(new FileInputStream(sourcePath));
		
		int width = 800;
		int height = 800;
		
		FileLogHelper.writeLog("testlog");
		
		//ImageHelper.saveImageAsJpg(sourcePath, targetPath, width, height, true);

	}
}

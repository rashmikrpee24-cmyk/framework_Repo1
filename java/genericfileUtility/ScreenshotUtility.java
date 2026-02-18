package genericfileUtility;
	import java.io.File;
	import org.openqa.selenium.*;
	import org.openqa.selenium.io.FileHandler;

	public class ScreenshotUtility {

	    public static String capture(WebDriver driver, String name) throws Exception {

	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);

	        String path = "./screenshots/" + name + ".png";
	        File dest = new File(path);

	        FileHandler.copy(src, dest);
	        return path;
	    }
	}



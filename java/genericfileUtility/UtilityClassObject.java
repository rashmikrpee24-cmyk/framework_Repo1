package genericfileUtility;
import org.openqa.selenium.WebDriver;

public class UtilityClassObject {
	
	    private static WebDriver driver;

	    public static void setDriver(WebDriver d) {
	        driver = d;
	    }

	    public static WebDriver getDriver() {
	        return driver;
	    }
	}



package genericfileUtility;
import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	
	    public String getDataFromPropertiesFile(String key) throws Throwable {

	        FileInputStream fis = new FileInputStream("/Selenium_project/src/test/resources/PipeDrive.properties file.properties");
	        Properties p = new Properties();
	        p.load(fis);

	        return p.getProperty(key);
	    }
	}


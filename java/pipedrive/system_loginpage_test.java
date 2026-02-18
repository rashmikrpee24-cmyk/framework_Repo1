package pipedrive;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class system_loginpage_test {
	
		  public static void main(String[] args) throws Exception {

		        // ---------- Read Properties ----------
		        FileInputStream fis = new FileInputStream("C:\\Users\\ranga\\Desktop\\New folder\\Selenium_project\\src\\test\\resources\\PipeDrive.properties file.properties");

		        Properties p = new Properties();
		        p.load(fis);

		        String browser = p.getProperty("browser");
		        String url = p.getProperty("url");
		        String un = p.getProperty("Email");
		        String pwd = p.getProperty("Password");

		        // ---------- Launch Browser ----------
		        WebDriver driver = null;

		        if (browser.equalsIgnoreCase("chrome")) {
		            driver = new ChromeDriver();
		        } else if (browser.equalsIgnoreCase("firefox")) {
		            driver = new FirefoxDriver();
		        }

		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		        driver.get(url);

		        // ---------- Login ----------
		        driver.findElement(By.linkText("Log in")).click();

		        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(un);
		        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		    	driver.findElement(By.xpath("//button[@class='puco-button puco-button--primary puco-button--width-auto submit-button bt fs-unmask']")).click();
		        
}}
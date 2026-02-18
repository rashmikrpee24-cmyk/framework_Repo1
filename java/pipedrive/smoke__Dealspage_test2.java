package pipedrive;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class smoke__Dealspage_test2 {
	
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
		        // Click Login Button

		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//ul[@class='fe-root-side-menu fe-root-side-menu--lastItemBorder-bottom fs-unmask']/descendant::a[5]")).click();
	            driver.findElement(By.xpath("//button[@class='cui5-button cui5-button--variant-primary cui5-button-group-item--first-child']")).click();
		       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8123271918");
		       driver.findElement(By.xpath("//div[@class='cui5-text ff_v13203__InputSelectAddMore__disabled__-tD']")).sendKeys("8123271918");
		   
		        Thread.sleep(2000);
		        WebElement dateField = driver.findElement(By.id("date"));
		        dateField.clear();
		        dateField.sendKeys("14-02-2026");
		        driver.findElement(By.xpath("//button[@class='cui5-button cui5-button--variant-primary']")).click();
		       
		  }
	}

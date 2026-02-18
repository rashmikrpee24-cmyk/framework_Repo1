package pipedrive;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactSubmodule_Organization_test {
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
   driver.findElement(By.xpath("//ul[@class='fe-root-side-menu fe-root-side-menu--lastItemBorder-bottom fs-unmask']/descendant::a[10]")).click();
   driver.findElement(By.xpath("//a[@class='fe-root-secondary-menu__item-link fe-root-secondary-menu__item-link--active']")).click();
    driver.findElement(By.xpath("//div[@class='cui5-button-group cui5-split-button']")).click();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rash123");
    driver.findElement(By.xpath("//div[@class='cui5-select__box']")).click();
    Select sel=new Select(null);
    sel.deselectByValue("customer");
    Thread.sleep(2000);
   // driver.findElement(By.xpath("//button[@class='cui5-button cui5-button--variant-primary']")).click();
    driver.findElement(By.xpath("//button[@class='cui5-button__label']")).click();
    driver.findElement(By.xpath("class=\"cui5-icon cui5-icon--color-primary cui5-icon--size-s cui5-select__toggle")).click();
    driver.findElement(By.xpath("//span[@class='cui5-icon cui5-icon--color-primary cui5-icon--size-s cui5-select__toggle']")).sendKeys("wert");
    
}
}
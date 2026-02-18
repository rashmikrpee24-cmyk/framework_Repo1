package ObjectrepositoryUtility;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

	public class BasePage_test {

	    protected WebDriver driver;

	    public BasePage_test(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    }
	}
	

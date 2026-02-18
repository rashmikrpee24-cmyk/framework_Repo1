package ObjectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesInboxPageTest extends BasePage_test {

    public SalesInboxPageTest(WebDriver driver) {
        super(driver);
        
    }

    @FindBy(xpath="//button[contains(.,'Compose')]")
    private WebElement composeBtn;

    public void clickCompose() {
        composeBtn.click();
    }
}
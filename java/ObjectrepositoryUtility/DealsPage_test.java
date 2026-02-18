package ObjectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DealsPage_test extends BasePage_test {

    public DealsPage_test(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//button[contains(.,'Add deal')]")
    private WebElement addDealBtn;

    @FindBy(name="title")
    private WebElement dealNameTxt;

    @FindBy(xpath="//button[contains(.,'Save')]")
    private WebElement saveBtn;

    public void createDeal(String dealName) {
        addDealBtn.click();
        dealNameTxt.sendKeys(dealName);
        saveBtn.click();
    }
}
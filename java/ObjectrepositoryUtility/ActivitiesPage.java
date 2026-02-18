package ObjectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivitiesPage {

    WebDriver driver;

    public ActivitiesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//button[contains(.,'Add activity')]")
    private WebElement addActivityBtn;

    @FindBy(name="subject")
    private WebElement subjectTxt;

    @FindBy(xpath="//button[contains(.,'Save')]")
    private WebElement saveBtn;

    public void createActivity(String subject) {
        addActivityBtn.click();
        subjectTxt.sendKeys(subject);
        saveBtn.click();
    }

    public boolean isActivitiesLoaded() {
        return addActivityBtn.isDisplayed();
    }}
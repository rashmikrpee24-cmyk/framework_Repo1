package ObjectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsightsPage_test extends BasePage_test {

    public InsightsPage_test(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//span[contains(text(),'Dashboard')]")
    private WebElement dashboardTab;

    public boolean verifyDashboard() {
        return dashboardTab.isDisplayed();
    }
}
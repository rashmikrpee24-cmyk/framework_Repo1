package testBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ===== Module Locators =====

    @FindBy(xpath="//a[@href='/leads']")
    private WebElement leadsTab;

    @FindBy(xpath="//a[@href='/deals']")
    private WebElement dealsTab;

    @FindBy(xpath="//a[@href='/contacts']")
    private WebElement contactsTab;

    @FindBy(xpath="//a[contains(@href,'activities')]")
    private WebElement activitiesTab;

    @FindBy(xpath="//span[text()='Sales Inbox']")
    private WebElement salesInboxTab;

    @FindBy(xpath="//span[text()='Insights']")
    private WebElement insightsTab;

    @FindBy(xpath="//span[text()='Products']")
    private WebElement productsTab;

    @FindBy(xpath="//button[@aria-label='User menu']")
    private WebElement profileMenu;

    @FindBy(xpath="//span[text()='Log out']")
    private WebElement logoutBtn;

    // ===== Actions =====

    public void clickLeads() {
        leadsTab.click();
    }

    public void clickDeals() {
        dealsTab.click();
    }

    public void clickContacts() {
        contactsTab.click();
    }

    public void clickActivities() {
        activitiesTab.click();
    }

    public void clickSalesInbox() {
        salesInboxTab.click();
    }

    public void clickInsights() {
        insightsTab.click();
    }

    public void clickProducts() {
        productsTab.click();
    }

    public void logout() {
        profileMenu.click();
        logoutBtn.click();
    }
}

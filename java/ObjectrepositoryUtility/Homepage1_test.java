package ObjectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Homepage1_test extends BasePage_test {

    public Homepage1_test(WebDriver driver) {
        super(driver);
    }

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

    public void clickLeads() { leadsTab.click(); }
    public void clickDeals() { dealsTab.click(); }
    public void clickContacts() { contactsTab.click(); }
    public void clickActivities() { activitiesTab.click(); }
    public void clickSalesInbox() { salesInboxTab.click(); }
    public void clickInsights() { insightsTab.click(); }
    public void clickProducts() { productsTab.click(); }
	public void logoutApp() {
		// TODO Auto-generated method stub
		
	}
    
}

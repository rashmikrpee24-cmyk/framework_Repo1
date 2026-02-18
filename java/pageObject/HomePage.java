package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	    public HomePage(WebDriver driver){
	        PageFactory.initElements(driver,this);
	    }

	    @FindBy(xpath="//a[@aria-label='Leads']")
	    private WebElement leadsMenu;

	    @FindBy(xpath="//a[@aria-label='Deals']")
	    private WebElement dealsMenu;

	    @FindBy(xpath="//a[@aria-label='Contacts']")
	    private WebElement contactsMenu;

	    @FindBy(xpath="//img[contains(@class,'avatar')]")
	    private WebElement profileIcon;

	    @FindBy(xpath="//span[text()='Log out']")
	    private WebElement logoutBtn;

	    public void clickLeads(){ 
	    	leadsMenu.click();
	    	}
	    public void clickDeals(){ 
	    	dealsMenu.click();
	    	}
	    public void clickContacts(){
	    	contactsMenu.click();
	    	}

	    public void logout(){
	        profileIcon.click();
	        logoutBtn.click();
	    }
	}



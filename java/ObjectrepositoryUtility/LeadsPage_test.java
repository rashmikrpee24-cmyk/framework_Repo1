package ObjectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage_test  {

	    public LeadsPage_test(WebDriver driver){
	        PageFactory.initElements(driver,this);
	    }

	    @FindBy(xpath="//button[contains(.,'Lead')]")
	    private WebElement addLeadBtn;

	    @FindBy(name="title")
	    private WebElement titleTxt;

	    @FindBy(xpath="//button[contains(.,'Save')]")
	    private WebElement saveBtn;

	    public void createLead(String name){
	        addLeadBtn.click();
	        titleTxt.sendKeys(name);
	        saveBtn.click();
	    }
}


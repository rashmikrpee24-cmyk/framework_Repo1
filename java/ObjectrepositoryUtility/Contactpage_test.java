package ObjectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contactpage_test {
	public class ContactsPage extends BasePage_test {

	    public ContactsPage(WebDriver driver) {
	        super(driver);
	    }

	    @FindBy(xpath="//button[contains(.,'Add person')]")
	    private WebElement addPersonBtn;

	    @FindBy(name="name")
	    private WebElement nameTxt;

	    @FindBy(xpath="//button[contains(.,'Save')]")
	    private WebElement saveBtn;

	    public void createContact(String name) {
	        addPersonBtn.click();
	        nameTxt.sendKeys(name);
	        saveBtn.click();
	    }
	}

	
}

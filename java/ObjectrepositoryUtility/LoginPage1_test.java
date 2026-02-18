package ObjectrepositoryUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage1_test extends BasePage_test {

    public LoginPage1_test(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="login")
    private WebElement emailTxt;

    @FindBy(id="password")
    private WebElement passwordTxt;

    @FindBy(xpath="//button[@type='submit']")
    private WebElement loginBtn;

    public void login(String email, String pwd) {
        emailTxt.sendKeys(email);
        passwordTxt.sendKeys(pwd);
        loginBtn.click();
    }

	public boolean isLoginSuccess() {
		// TODO Auto-generated method stub
		return false;
	}

	public void LoginToApp(String username, String password) {
		// TODO Auto-generated method stub
		
	}

	
}


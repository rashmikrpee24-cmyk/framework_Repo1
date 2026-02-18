package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	 WebDriver driver;

	    By email = By.xpath("//input[@type='email']");
	    By password = By.xpath("//input[@type='password']");
	    By loginBtn = By.xpath("//button[@type='submit']");

	    public void LoginPage(WebDriver driver){
	        this.driver = driver;
	    }

	    public void login(String un, String pwd){
	        driver.findElement(email).sendKeys(un);
	        driver.findElement(password).sendKeys(pwd);
	        driver.findElement(loginBtn).click();
	    }
	}


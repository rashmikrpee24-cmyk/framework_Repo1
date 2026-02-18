package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DealsPage {
	 WebDriver driver;

	    By addDeal = By.xpath("//button[contains(.,'Deal')]");
	    By title = By.name("title");
	    By save = By.xpath("//button[contains(.,'Save')]");

	    public DealsPage(WebDriver driver){ 
	    	this.driver = driver; }

	    public void createDeal(String name){
	        driver.findElement(addDeal).click();
	        driver.findElement(title).sendKeys(name);
	        driver.findElement(save).click();
	    }
	}



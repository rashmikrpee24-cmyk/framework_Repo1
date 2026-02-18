package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivitiesPage {
	 WebDriver driver;

	    By addAct = By.xpath("//button[contains(.,'Activity')]");
	    By subject = By.name("subject");
	    By save = By.xpath("//button[contains(.,'Save')]");

	    public ActivitiesPage(WebDriver d){ 
	    	driver=d;
	    	}

	    public void createActivity(String s){
	        driver.findElement(addAct).click();
	        driver.findElement(subject).sendKeys(s);
	        driver.findElement(save).click();
	    }
	}


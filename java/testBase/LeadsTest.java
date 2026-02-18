package testBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadsTest {
	    WebDriver driver;

	    By addLead = By.xpath("//button[contains(.,'Lead')]");
	    By name = By.name("title");
	    By save = By.xpath("//button[contains(.,'Save')]");

	    public void createLead(String leadName) {
	        driver.findElement(addLead).click();
	        driver.findElement(name).sendKeys(leadName);
	        driver.findElement(save).click();
	    }
	}


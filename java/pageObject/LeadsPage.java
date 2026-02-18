package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadsPage {
	WebDriver driver;

    By addLead = By.xpath("//button[contains(.,'Lead')]");
    By title = By.name("title");
    By save = By.xpath("//button[contains(.,'Save')]");

    public LeadsPage(WebDriver driver){ this.driver = driver; }

    public void createLead(String name){
        driver.findElement(addLead).click();
        driver.findElement(title).sendKeys(name);
        driver.findElement(save).click();
    }
}


package testBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DealsTest {
	@SuppressWarnings("null")
	@Test
	public void createDealTest() {
		WebDriver driver = null; 

	    // click Deals module
	    driver.findElement(
	        By.xpath("//span[normalize-space()='Deals']/ancestor::a")
	    ).click();

	    // add deal
	    driver.findElement(
	        By.xpath("//button[contains(.,'Deal')]")
	    ).click();

	    // enter deal name
	    driver.findElement(By.name("title"))
	          .sendKeys("Deal_Auto_123");

	    // save
	    driver.findElement(
	        By.xpath("//button[contains(.,'Save')]")
	    ).click();
	}
}

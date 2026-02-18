package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	 WebDriver driver;

	    By addProduct = By.xpath("//button[contains(.,'Product')]");
	    By name = By.name("name");
	    By save = By.xpath("//button[contains(.,'Save')]");

	    public ProductsPage(WebDriver d){ driver=d; }

	    public void createProduct(String n){
	        driver.findElement(addProduct).click();
	        driver.findElement(name).sendKeys(n);
	        driver.findElement(save).click();
	    }
	}


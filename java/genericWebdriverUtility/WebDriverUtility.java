package genericWebdriverUtility;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class WebDriverUtility {

    public void waitForElement(WebDriver driver, WebElement ele) {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(ele));
    }

    public void selectByText(WebElement ele, String text) {
        new Select(ele).selectByVisibleText(text);
    }

    public void mouseHover(WebDriver driver, WebElement ele) {
        new Actions(driver).moveToElement(ele).perform();
    }

    public void rightClick(WebDriver driver, WebElement ele) {
        new Actions(driver).contextClick(ele).perform();
    }

    public void doubleClick(WebDriver driver, WebElement ele) {
        new Actions(driver).doubleClick(ele).perform();
    }

    public void switchToAlertAccept(WebDriver driver) {
        driver.switchTo().alert().accept();
    }

	public void waitForPageToLoad(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void maxwindow(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
}

package genericfileUtility;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homepage_ValidationUtility {

@Test
public void homepageTest(Method mtd) {

    System.out.println(mtd.getName() + " Test Start");

    String expText = "Home";

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    driver.get("https://app.pipedrive.com/");

    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rashmik.40k@gmail.com");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rashmi@123");
	driver.findElement(By.xpath("//button[@class='puco-button puco-button--primary puco-button--width-auto submit-button bt fs-unmask']")).click();
	
    driver.findElement(By.xpath("//button[@class='puco-button puco-button--primary puco-button--width-auto submit-button bt fs-unmask']\""))
          .click();

    String ele = driver.findElement(By.xpath("//a[contains(text(),'Home')]")).getText();
   // Hard assert
    Assert.assertEquals(ele, expText);

    driver.quit();
}
}

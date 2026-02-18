package Com.ComCast.CRM.genericbasetest;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import ObjectrepositoryUtility.LoginPage1_test;
public class BaseTest {

    public static WebDriver driver;

    @Parameters({"browser","url","username","password"})
    @BeforeMethod
    public void setup(String browser, String url,
                      String username, String password) {

        // ===== Browser Launch =====
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(20));

        // ===== Launch App =====
        driver.get(url);

        // ===== Login =====
        LoginPage1_test login = new LoginPage1_test(driver);
        login.login(username, password);
    }

    @AfterMethod
    public void teardown() {
        // ===== Logout logic can go here if needed =====
        driver.quit();
    }
}
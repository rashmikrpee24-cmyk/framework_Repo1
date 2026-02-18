package Com.ComCast.CRM.genericbasetest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import ObjectrepositoryUtility.Homepage1_test;
import ObjectrepositoryUtility.LoginPage1_test;
import genericWebdriverUtility.WebDriverUtility;
import genericfileUtility.FileUtility;
import genericfileUtility.JavaUtility;
public class BaseClass_ {

    public WebDriver driver;
    public static WebDriver sdriver;

    public WebDriverUtility Web = new WebDriverUtility();
    public FileUtility file = new FileUtility();
    public Homepage1_test home;
    public JavaUtility java = new JavaUtility();

    //------------------ BEFORE SUITE -------------------//
    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        System.out.println("DB connection or report setup");
    }

    //----------------- BEFORE CLASS -------------------//
    @org.testng.annotations.Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void configBC(@Optional("chrome") String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            driver = new ChromeDriver();
        }

        sdriver = driver;
        Web.maxwindow(driver);
        Web.waitForPageToLoad(driver);
    }

    //----------------- BEFORE METHOD -------------------//
    @BeforeMethod(alwaysRun = true)
    public void configBM() throws Throwable {

        String URL = file.getDataFromPropertiesFile("url");
        driver.get(URL);

        LoginPage1_test lp = new LoginPage1_test(driver);

        String Username = file.getDataFromPropertiesFile("user");
        String Password = file.getDataFromPropertiesFile("password");

        lp.LoginToApp(Username, Password);

        // create homepage AFTER login
        home = new Homepage1_test(driver);
    }

    //----------------- AFTER METHOD -------------------//
    @AfterMethod(alwaysRun = true)
    public void configAM() {
        try {
            if (driver != null && home != null) {
                home.logoutApp();
            }
        } catch (Exception e) {
            System.out.println("Logout skipped due to browser issue");
        }
    }

    //----------------- AFTER CLASS -------------------//
    @AfterClass(alwaysRun = true)
    public void configAC() {
        if (driver != null) {
            driver.quit();
        }
    }

    //----------------- AFTER SUITE -------------------//
    @AfterSuite(alwaysRun = true)
    public void configAS() {
        System.out.println("DB close or report flush");
    }
}
package ObjectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage_test extends BasePage_test {

    public ProductsPage_test(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//button[contains(.,'Add product')]")
    private WebElement addProductBtn;

    public void clickAddProduct() {
        addProductBtn.click();
    }

	
}
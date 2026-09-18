package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class InvoicePage {

    WebDriver driver;


    public InvoicePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyInvoicePage() {
        return driver.getCurrentUrl().contains("pdf");
    }

}

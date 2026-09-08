package Pages;

import org.openqa.selenium.WebDriver;

public class InvoicePage {

    WebDriver driver;

    public InvoicePage(WebDriver driver) {
        this.driver = driver;
    }

    boolean isInvoicePageDisplayed() {
        return driver.getCurrentUrl().contains("pdf");
    }
}

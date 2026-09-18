package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoiceHistoryPopUp {

    WebDriver driver;

    @FindBy(id = "view-invoice-INV")
    WebElement viewInvoiceBtn;

    public InvoiceHistoryPopUp(WebDriver driver) {
        this.driver = driver;
    }
    public InvoicePage clickViewInvoice() {
        viewInvoiceBtn.click();

        return new InvoicePage(driver);

    }
    
}

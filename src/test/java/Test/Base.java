package Test;

import Pages.*;
import Utils.BrowserFactory;
import Utils.ReadData;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory= new BrowserFactory();

    //open chrome and store the driver in a variable
    final WebDriver driver = browserFactory.launchBrowser("chrome","https://ndosisimplifiedautomation.vercel.app/");

    //creates homepage n connects it to browser driver so elements can be used from homepage
    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    public DeviceOrderPage deviceOrderPage = PageFactory.initElements(driver, DeviceOrderPage.class);
    public InvoicePage invoicePage = PageFactory.initElements(driver, InvoicePage.class);
    public InvoiceHistoryPopUp invoiceHistoryPopUp = PageFactory.initElements(driver, InvoiceHistoryPopUp.class);
    public LearnPage learnPage = PageFactory.initElements(driver, LearnPage.class);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public OrderSummaryPage orderSummaryPage = PageFactory.initElements(driver, OrderSummaryPage.class);
    public OrderConfirmationPopUp orderConfirmationPopUp = PageFactory.initElements(driver, OrderConfirmationPopUp.class);
    public TakesScreenshots takesScreenshots = new TakesScreenshots();



    boolean isInvoicePageDisplayed() {
        return driver.getCurrentUrl().contains("pdf");
    }


}

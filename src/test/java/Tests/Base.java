package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakesScreenshots;
import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.launchBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");


        // Initialize page objects
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    DeviceOrderPage deviceOrderPage = PageFactory.initElements(driver, DeviceOrderPage.class);
    InvoicePage invoicePage = PageFactory.initElements(driver, InvoicePage.class);
    InvoiceHistoryPopUp invoiceHistoryPopUp = PageFactory.initElements(driver, InvoiceHistoryPopUp.class);
    LearnPage learnPage = PageFactory.initElements(driver, LearnPage.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    OrderSummaryPage orderSummaryPage = PageFactory.initElements(driver, OrderSummaryPage.class);
    OrderConfirmationPopUp orderConfirmationPopUp = PageFactory.initElements(driver, OrderConfirmationPopUp.class);
    TakesScreenshots takesScreenshots = new TakesScreenshots();



    boolean isInvoicePageDisplayed() {
        return driver.getCurrentUrl().contains("pdf");
    }


}

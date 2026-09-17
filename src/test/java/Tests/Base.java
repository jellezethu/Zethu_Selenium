package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakesScreenshots;
import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;

    public HomePage homePage;
    public DeviceOrderPage deviceOrderPage;
    public InvoicePage invoicePage;
    public InvoiceHistoryPopUp invoiceHistoryPopUp;
    public LearnPage learnPage;
    public LoginPage loginPage;
    public OrderSummaryPage orderSummaryPage;
    public OrderConfirmationPopUp orderConfirmationPopUp;
    public TakesScreenshots takesScreenshots;

    @BeforeSuite
    public void setupReport() {
        // Initialize the Extent HTML report system
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void setupBrowser() {
        // Open Chrome and store the driver in the shared variable
        driver = BrowserFactory.launchBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");


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

package Tests;

import Pages.HomePage;
import Pages.LearnPage;
import Utils.ReadData;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.latest.backgroundservice.BackgroundService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.DeviceOrderPage;
import Pages.LoginPage;
import Pages.OrderSummaryPage;
import Pages.InvoicePage;
import Pages.OrderConfirmationPopUp;
import Pages.InvoiceHistoryPopUp;

import java.time.Duration;


//import static Utils.BrowserFactory.driver;


public class LoginTests extends Base {

    //Variables
    LoginPage LoginPage;
    HomePage HomePage;
    LearnPage LearnPage;
    DeviceOrderPage DeviceOrderPage;
    OrderSummaryPage OrderSummaryPage;
    OrderConfirmationPopUp OrderConfirmationPopUp;
    InvoiceHistoryPopUp InvoiceHistoryPopUp;
    InvoicePage InvoicePage;


//    @Test(priority = 0)
//    public void clickLoginButton() throws InterruptedException {
//        takesScreenshots.takesSnapShot(driver,"landing page");
//        LoginPage.clickLoginButton();
//    }
//
//    @Test(priority = 1)
//    public void enterUsernameTests(){
//        loginPage.enterUsername(ReadData.username);
//    }
//
//    @Test(priority = 2)
//    public void enterPassword(){
//        loginPage.enterPassword(ReadData.password);
//        takesScreenshots.takesSnapShot(driver,"login page");
//    }
//
//    @Test(priority = 3)
//    public void clickLoginSubmitButtonTest() throws InterruptedException {
//        loginPage.clickLoginSubmitButton();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("dashboard-welcome")));
//        takesScreenshots.takesSnapShot(driver,"dashboard page");
//    }
//    @Test(priority = 4)
//    public void verifyLoginSuccessTest(){
//        homePage.verifyLoginSuccess();
//        takesScreenshots.takesSnapShot(driver,"Landing page");
//        //HomePage homepage = new HomePage(driver);
//        //homepage.verifyLoginSuccess();
//    }

    @Test(priority = 5)
    public void clickLearnTab(){
        learnPage.clickLearnButton();
        //learnPage.clickLearnPage();
        takesScreenshots.takesSnapShot(driver,"Learn page");
    }
    @Test(priority = 6)
    public void clickLearningMaterial(){
        learnPage.clickLearningMaterials();
        //homepage.clickLearningMaterialmenu();
        takesScreenshots.takesSnapShot(driver,"Learning Material page");
    }
    @Test(priority = 7)
    public void clickWebAutomation() throws InterruptedException{
        deviceOrderPage = learnPage.clickWebAutomationTab();
        takesScreenshots.takesSnapShot(driver,"Web Automation page");
    }

    @Test(priority = 8)
    public void selectDeviceDetails() {
        deviceOrderPage.selectDeviceType("phone");
        deviceOrderPage.selectBrand("Apple");
        deviceOrderPage.selectStorage("128GB");
        deviceOrderPage.selectColor("Blue");
        deviceOrderPage.enterQuantity("2");
        deviceOrderPage.enterAddress("123 Main Street");

        takesScreenshots.takesSnapShot(driver,"Device Details");

        deviceOrderPage.clickNextButton();
    }

    @Test(priority = 9)
    public void verifyOrderSummary() {
        orderSummaryPage.verifyOrderSummary();
        OrderSummaryPage.selectExpressShippingOption();
        OrderSummaryPage.selectOneYearWarrantyOption();
        OrderSummaryPage.enterDiscountCode("SAVA10");
        OrderSummaryPage.clickApplyDiscountBtn();
        OrderSummaryPage.clickPurchaseDevicesBtn();
        takesScreenshots.takesSnapShot(driver,"Discounts and Shipping Applied");

        //orderSummaryPage.clickConfirmPurchaseButton();
    }

    @Test(priority = 10)
    public void OrderConfirmationPopUp() {
        orderConfirmationPopUp.clickViewInvoice();
        takesScreenshots.takesSnapShot(driver,"Order Confirmation Pop Up");

        //orderConfirmationPopUp.clickViewInvoiceButton();
    }
    @Test(priority = 11)
    public void InvoiceHistoryPopUp() {
        invoiceHistoryPopUp.clickViewInvoice();
        takesScreenshots.takesSnapShot(driver,"Invoice History Pop Up");

        //invoiceHistoryPopUp.clickViewInvoiceButton();
    }
    @Test(priority = 12)
    public void InvoicePage() {
        invoicePage.verifyInvoicePage();
        takesScreenshots.takesSnapShot(driver, "Invoice Page");

        Assert.assertTrue(invoicePage.verifyInvoicePage());
    }

}

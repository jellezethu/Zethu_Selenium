package Tests;

import Pages.HomePage;
import Pages.LearnPage;
import Utils.ReadData;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.latest.backgroundservice.BackgroundService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Pages.DeviceOrderPage;
import Pages.LoginPage;
import Pages.OrderSummaryPage;
import Pages.InvoicePage;
import Pages.OrderConfirmationPopUp;
import Pages.InvoiceHistoryPopUp;



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


    @Test(priority = 0)
    public void clickLoginButton() throws InterruptedException {
        takesScreenshots.takesSnapShot(driver,"landing page");
        homePage.clickLoginButton();
    }

    @Test(priority = 1)
    public void enterUsernameTests(){
        loginPage.enterUsername(ReadData.username);
    }

    @Test(priority = 2)
    public void enterPassword(){
        loginPage.enterPassword(ReadData.password);
        takesScreenshots.takesSnapShot(driver,"login page");
    }

    @Test(priority = 3)
    public void clickLoginSubmitButton() throws InterruptedException {
        loginPage.clickLoginSubmitButton();
        WebDriver wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.ID("login-submit"));
        takesScreenshots.takesSnapShot(driver,"dashboard page");
    }
    @Test(priority = 4)
    public void verifyLoginSuccessTest(){
        homePage.verifyLoginSuccess();
        takesScreenshots.takesSnapShot(driver,"Landing page");
        //HomePage homepage = new HomePage(driver);
        //homepage.verifyLoginSuccess();
    }

//    @Test(priority = 5)
//    LoginPage loginPage = new LoginPage(driver);
//        takesScreenshots.takesSnapShot(driver,"login page");
//
//    @Test(priority = 6)
//    HomePage homePage = new HomePage(driver);
//    takesScreenshots.takesSnapShot(driver,"dashboard page");

    @Test(priority = 5)
    public void clickLearnTabTest(){
        learnPage = homePage.clickLearnTabTest();
        //learnPage.clickLearnPage();
        takesScreenshots.takesSnapShot(driver,"Learn page");
    }
    @Test(priority = 6)
    public void clickLearningMaterialMenuTest(){
        learnPage.clickLearningMaterials();
        //homepage.clickLearningMaterialmenu();
        takesScreenshots.takesSnapShot(driver,"Learning Material page");
    }
    @Test(priority = 7)
    public void clickWebAutomationMenuTest(){
        learnPage.clickWebAutomation();
        takesScreenshots.takesSnapShot(driver,"Web Automation page");
    }

    @Test(priority = 8)
    public void selectDeviceDetailsTest() {
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

}

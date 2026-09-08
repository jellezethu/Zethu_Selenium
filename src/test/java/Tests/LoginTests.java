package Tests;

import Pages.HomePage;
import Utils.ReadData;
import org.openqa.selenium.devtools.latest.backgroundservice.BackgroundService;
import org.testng.annotations.Test;



//import static Utils.BrowserFactory.driver;


public class LoginTests extends Base {


    @Test
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
        Thread.sleep(2000);
        takesScreenshots.takesSnapShot(driver,"dashboard page");
    }
    @Test(priority = 4)
    public void verifyLoginSuccessTest(){
        HomePage.verifyLoginSuccess();
        takesScreenshots.takesSnapShot(driver,"Landing page");
    }
}

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginToNdosiWebsite {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();

    }

    @Test

    public void clickLoginButton() {
        driver.findElement(By.className("user-pill")).click();

    }

    @Test (dependsOnMethods = {"clickLoginButton"})
    public void enterUsername() {
        WebElement username = driver.findElement(By.id("login-email"));
        username.sendKeys("jelle@gmail.com");
    }

    @Test (dependsOnMethods = {"enterUsername"})
    public void enterPassword() {
        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("p@ssword");
    }

    @Test (dependsOnMethods = {"enterPassword"})
    public void clickLoginSubmitButton() {
        WebElement loginSubmitButton = driver.findElement(By.id("login-submit"));
        loginSubmitButton.click();
    }

    @Test (dependsOnMethods = {"clickLoginSubmitButton"})
    public void verifyLoginSuccess() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("nav-dropdown-trigger")));
        //boolean loginSuccess = driver.findElement(By.xpath("//span[text()='My learning']")).isDisplayed();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}

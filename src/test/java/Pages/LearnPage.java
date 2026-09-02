package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearnPage {

    WebDriver driver;

   @FindBy(xpath = "<span>Learn</span>")
    WebElement learnTab;

   @FindBy(xpath ="<span>Learning Materials</span>")
   WebElement materialsTab;

    public LearnPage(WebDriver driver) {
            this.driver = driver;

    }

    public void clickLoginButton() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(learnTab));
        learnTab.isDisplayed();


    }
}

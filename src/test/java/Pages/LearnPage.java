package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearnPage {

    WebDriver driver;


    public LearnPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")
    WebElement learnTab;

    @FindBy(xpath ="//*[@id=\"app-root\"]/nav/div[2]/div[2]/button[2]/span[2]")
    WebElement materialsTab;


    public void clickLearnButton() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(learnTab));
        learnTab.isDisplayed();

    }

    public void clickLearningMaterials() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(materialsTab));
        materialsTab.isDisplayed();

    }
}

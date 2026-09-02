package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPopUp {

    WebDriver driver;

    @FindBy(id = "view-history-btn")
    WebElement viewHistoryBtn;

    public OrderConfirmationPopUp(WebDriver driver) {
        this.driver = driver;
    }

    public void clickViewHistoryBtn() {
        viewHistoryBtn.click();
    }
}

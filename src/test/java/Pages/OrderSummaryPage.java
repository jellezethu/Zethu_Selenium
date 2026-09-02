package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummaryPage {

    WebDriver driver;

    @FindBy(id = "shipping-option-express")
    WebElement expressShippingOption;

    @FindBy(id = "warranty-option-1yr")
    WebElement oneYearWarrantyOption;

    @FindBy(id ="discount-code")
    WebElement discountCodeField;

    @FindBy(id = "apply-discount-btn")
    WebElement applyDiscountBtn;

    @FindBy(id ="purchase-devices-btn")
    WebElement purchaseDevicesBtn;

    public void selectExpressShippingOption() {
        expressShippingOption.click();
    }

    public void selectOneYearWarrantyOption() {
        oneYearWarrantyOption.click();
    }

    public void enterDiscountCode(String discountCode) {
        discountCodeField.sendKeys(discountCode);
    }

    public void clickApplyDiscountBtn() {
        applyDiscountBtn.click();
    }

    public void clickPurchaseDevicesBtn() {
        purchaseDevicesBtn.click();
    }

    public OrderSummaryPage(WebDriver driver) {
        this.driver = driver;
    }

}

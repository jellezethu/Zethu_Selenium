package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeviceOrderPage {
    WebDriver driver;

    //
    // @FindBy(xpath = "")

    @FindBy(xpath = "<span class=\"tab-label\">Web Automation Advance</span>")
    WebElement webAutomationAdvance;

    @FindBy(id = "deviceType")
    WebElement deviceType;

    @FindBy(id = "brand")
    WebElement brand;

    @FindBy(xpath = "<span>128GB</span>")
    WebElement storage;

    @FindBy(id = "color")
    WebElement color;

    @FindBy(id = "quantity")
    WebElement quantity;

    @FindBy(id = "address")
    WebElement address;

    @FindBy(id = "Inventory-next-btn")
    WebElement nextButton;

    public DeviceOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDeviceType(String deviceTypeValue) {
        deviceType.sendKeys(deviceTypeValue);
    }

    public void selectBrand(String brandValue) {
        deviceType.sendKeys(brandValue);
    }

    public void selectStorage(String storageValue) {
        storage.sendKeys(storageValue);
    }

    public void selectColor(String colorValue) {
        color.sendKeys(colorValue);
    }

    public void enterQuantity(String quantityValue) {
        quantity.sendKeys(quantityValue);
    }

    public void enterAddress(String addressValue) {
        address.sendKeys(addressValue);
    }

    public void clickNextButton() {
        nextButton.click();
    }
}

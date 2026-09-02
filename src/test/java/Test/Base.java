package Test;

import Pages.HomePage;
import Utils.BrowserFactory;
import Utils.ReadData;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory= new BrowserFactory();

    //open chrome and store the driver in a variable
    final WebDriver driver = browserFactory.launchBrowser("chrome","https://ndosisimplifiedautomation.vercel.app/");

    //creates homepage n connects it to browser driver so elements can be used from homepage
    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    public TakesScreenshots takesScreenshots = new TakesScreenshots();

    ReadData readData;

    {
        try {
            readData = new ReadData();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilis.WaitUtilis;

public class LensKartHomePage {

    private WebDriver driver;
    private WaitUtilis waitUtils;

    // Locators
    private By searchBox = By.cssSelector("input[type='search']");

    public LensKartHomePage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtilis(driver);
    }

    public void searchProduct(String productName) {

        WebElement search = waitUtils.waitForVisibility(searchBox);

        search.click();
        search.sendKeys(productName);
        search.sendKeys(Keys.ENTER);
    }
}

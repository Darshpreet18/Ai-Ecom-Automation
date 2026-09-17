package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilis.WaitUtilis;

import java.util.List;

public class SearchResultPage {
    private WebDriver driver;
    private WaitUtilis waitUtils;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtilis(driver);
    }

    private By productCards = By.cssSelector("img[loading='eager']");
    public int getProductCount() {

        List<WebElement> products =
                driver.findElements(productCards);

        return ((List<?>) products).size();
    }
    public boolean areProductsDisplayed() {

        return getProductCount() > 0;
    }

    public boolean isSearchResultsDisplayed() {

        return waitUtils
                .waitForVisibility(productCards)
                .isDisplayed();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}

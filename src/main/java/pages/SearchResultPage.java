package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilis.WaitUtilis;

public class SearchResultPage {
    private WebDriver driver;
    private WaitUtilis waitUtils;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtilis(driver);
    }

    private By productCards = By.cssSelector("img[loading='eager']");

    public boolean isSearchResultsDisplayed() {

        return waitUtils
                .waitForVisibility(productCards)
                .isDisplayed();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}

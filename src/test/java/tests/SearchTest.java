package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LensKartHomePage;
import pages.SearchResultPage;

public class SearchTest extends BaseTest {

    @Test
    public void searchForSunglasses() {

        LensKartHomePage homePage =
                new LensKartHomePage(driver);

        SearchResultPage searchResultsPage =
                new SearchResultPage(driver);

        // Search product
        homePage.searchProduct("Sunglasses");

        // Verify results page
        Assert.assertTrue(
                searchResultsPage.isSearchResultsDisplayed(),
                "Search results were not displayed"
        );

        System.out.println(
                "Search URL: " +
                        searchResultsPage.getCurrentUrl()
        );
    }
}

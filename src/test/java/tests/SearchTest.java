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
                searchResultsPage.areProductsDisplayed(),
                "No products were displayed"
        );

        System.out.println(
                "Number of elements found: " +
                        searchResultsPage.getProductCount()
        );
    }
    @Test
    public void searchForEyeGlasses() {

        LensKartHomePage homePage =
                new LensKartHomePage(driver);

        SearchResultPage searchResultsPage =
                new SearchResultPage(driver);

        // Search product
        homePage.searchProduct("Eyeglasses");

        // Verify results page
        Assert.assertTrue(
                searchResultsPage.areProductsDisplayed(),
                "No products were displayed"
        );

        System.out.println(
                "Number of elements found: " +
                        searchResultsPage.getProductCount()
        );
    }
}

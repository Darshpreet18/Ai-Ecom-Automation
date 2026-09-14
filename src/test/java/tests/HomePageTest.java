package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    @Test
    public void verifyLenskartHomePage() {

        String title = driver.getTitle();

        System.out.println("Page Title: " + title);

        Assert.assertTrue(
                title.toLowerCase().contains("lenskart"),
                "Lenskart home page was not opened"
        );
    }
}

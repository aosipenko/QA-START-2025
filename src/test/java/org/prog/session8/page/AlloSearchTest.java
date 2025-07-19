package org.prog.session8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prog.session8.page.AlloPage;
import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

public class AlloSearchTest {

    private WebDriver driver;
    private AlloPage alloPage;

    @BeforeSuite
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        alloPage = new AlloPage(driver);
    }

    @Test
    public void testPriceHasHryvnia() {
        alloPage.openHomePage();
        alloPage.searchForIphone();
        assertTrue(alloPage.priceContainsHryvniaSymbol(), "Price does not contain ₴ symbol");
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

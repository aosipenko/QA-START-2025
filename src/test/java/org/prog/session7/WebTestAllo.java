package org.prog.session7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class WebTestAllo {

    private WebDriver driver;

    @BeforeSuite
    public void initWebDriver() {
        driver = new ChromeDriver();
    }

    @Test
    public void testIphoneSearch() {
        driver.get("https://allo.ua/");

        WebElement search = driver.findElement(By.cssSelector("input[placeholder]"));
        search.sendKeys("iPhone");
        search.sendKeys(Keys.ENTER);

        WebElement item = driver.findElement(By.className("product-card__title"));
        System.out.println("iPhone found");
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}

package org.prog.session8.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlloPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public AlloPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openHomePage() {
        driver.get("https://allo.ua/");
        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("input.search-form__input")));
    }

    public void searchForIphone() {
        WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(3));

        if (!driver.findElements(By.id("onetrust-accept-btn-handler")).isEmpty()) {
            WebElement cookieBtn = shortWait.until(ExpectedConditions.elementToBeClickable(
                    By.id("onetrust-accept-btn-handler")));
            cookieBtn.click();
        }

        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("input.search-form__input")));
        searchInput.sendKeys("iPhone");
        searchInput.sendKeys(Keys.ENTER);
    }

    public boolean priceContainsHryvniaSymbol() {
        WebElement price = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".v-pb__cur")));
        return price.getText().contains("₴");
    }
}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.common.InputHandler;
import utils.DriverManager;

import java.time.Duration;
import java.util.Objects;

public abstract class BasePage {
    public static WebDriver driver;
    protected InputHandler inputHandler = new InputHandler();
    protected WebDriverWait w;

    //    public BasePage(WebDriver driver) {
//        this.driver = driver;
//        w = new WebDriverWait(driver, Duration.ofSeconds(10));
//    }
    public BasePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
        if (Objects.isNull(DriverManager.getDriver())) {
            DriverManager.setupDriver();
            driver = DriverManager.getDriver();
        }
        w = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected void waitForElementVisible(By locator) {
        w.until(ExpectedConditions
                .presenceOfElementLocated(locator));
    }

    protected void waitForChildElementVisible(WebElement element, By locator) {
    }

    protected boolean isElementPresent(By by) {
        boolean present;
        try {
            driver.findElement(by);
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
        return present;
    }

    protected boolean isChildElementPresent(WebElement element, By by) {
        boolean present;
        try {
            element.findElement(by);
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
        return present;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}

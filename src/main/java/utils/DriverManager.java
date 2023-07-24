package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Optional;

public class DriverManager {
    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    private DriverManager() {
    }

    public static void setupDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        webDriverThreadLocal.set(driver);

    }

    public static WebDriver getDriver() {
        return webDriverThreadLocal.get();
    }

    public static void quitDriver() {
        Optional.ofNullable(getDriver()).ifPresent(webdriver -> {
            webdriver.quit();
            webDriverThreadLocal.remove();
        });
    }
}

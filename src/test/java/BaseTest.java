

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public static WebDriver driver;

    @BeforeSuite
    public void startDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterSuite
    public void stopDriver() {
        driver.quit();
    }
    public WebDriver getDriver() {
        return driver;
    }

}
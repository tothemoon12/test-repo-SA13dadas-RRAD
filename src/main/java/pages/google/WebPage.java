package pages.google;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.util.Map;

public class WebPage extends BasePage {
    public WebPage(WebDriver driver) {
        super(driver);
    }

    public WebPage parsePageTitleAndPutToMap(Map<String, String> map) {
        int mapSize = map.size();
        String key = String.format("title %s", mapSize + 1);
        map.put(key, driver.getTitle());
        return this;
    }

    public GoogleSearchResultsPage returnToGoogleSearchResultsPage() {

        driver.navigate().back();

        return new GoogleSearchResultsPage(driver);
    }
}

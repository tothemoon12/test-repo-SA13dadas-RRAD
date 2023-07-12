package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class GoogleSearchResultsPage extends BasePage {
    private By searchResultsDivLocator = By.xpath("//div[@id='rso']");
    private WebElement searchResultsElement;
    private List<WebElement> searchResultsElementsList;

    public GoogleSearchResultsPage(WebDriver driver) {
        super(driver);
        waitForElementVisible(searchResultsDivLocator);
        searchResultsElement = driver.findElement(searchResultsDivLocator);
        searchResultsElementsList = searchResultsElement.findElements(By.xpath("./div"))
                .stream()
                .filter(element -> isChildElementPresent(element, By.xpath(".//img[@class='XNo5Ab' and not(ancestor::div[contains(@jsname,'N760b')])]")))
                .collect(Collectors.toList());
    }

    public WebPage openSearchResultByNumber(int number) {
        String url = searchResultsElementsList.get(number - 1).findElement(By.xpath(".//a[1]")).getAttribute("href");
        System.out.println(url);
        driver.get(url);
        return new WebPage(driver);
    }

}

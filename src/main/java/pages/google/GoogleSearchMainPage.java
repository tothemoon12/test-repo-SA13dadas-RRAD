package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class GoogleSearchMainPage extends BasePage {
    private By searchFormLocator = By.xpath("//form[@action='/search']");
    private By textAreaSearchChildLocator = By.xpath(".//textarea");

    private WebElement searchFormElement;


    public GoogleSearchMainPage() {
    }

    public GoogleSearchMainPage openPage() {
        driver.get("https://www.google.com/");
        waitForElementVisible(searchFormLocator);
        searchFormElement = driver.findElement(searchFormLocator);
        return this;
    }

    public GoogleSearchMainPage enterSearchKey(String val) {

        inputHandler.sendKeysToTextElement(searchFormElement.findElement(textAreaSearchChildLocator), val);

        return this;
    }
    public GoogleSearchResultsPage selectFirstResultFromListBox(){
        waitForElementVisible(By.xpath("//div[@jscontroller='Dvn7fe' and @style='']"));
        inputHandler.clickOnFirstElementOfListBox(searchFormElement.findElement(By.xpath("//ul[@role='listbox']")));
        return new GoogleSearchResultsPage();
    }
}

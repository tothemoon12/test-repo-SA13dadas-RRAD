package pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputHandler {
    public void sendKeysToTextElement(WebElement element, String val) {
        element.click();
        element.clear();
        element.sendKeys(val);
    }

    public void clickOnFirstElementOfListBox(WebElement element) {
        element.findElement(By.xpath(".//li[1]")).click();
    }

}

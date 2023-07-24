import org.testng.Assert;
import org.testng.annotations.Test;
import pages.google.GoogleSearchMainPage;
import pages.google.GoogleSearchResultsPage;
import pages.google.WebPage;

import java.util.HashMap;
import java.util.Map;

public class SecondTaskTest extends BaseTest {
    @Test()
    public void test() {
        Map<String, String> map = new HashMap<>();

        WebPage webPage;
        String searchResultUrl;

        GoogleSearchResultsPage searchResultsPage = new GoogleSearchMainPage()
                .openPage()
                .enterSearchKey("Selenuim")
                .selectFirstResultFromListBox();

// Page 1
        searchResultUrl = searchResultsPage.getSearchResultUrl(1);
        webPage = searchResultsPage.openSearchResultByNumber(1);

        Assert.assertEquals(searchResultUrl, webPage.getCurrentUrl());

        webPage
                .parsePageTitleAndPutToMap(map)
                .returnToGoogleSearchResultsPage();

// Page 2
        searchResultUrl = searchResultsPage.getSearchResultUrl(2);
        webPage = searchResultsPage.openSearchResultByNumber(2);

        Assert.assertEquals(searchResultUrl, webPage.getCurrentUrl());

        webPage
                .parsePageTitleAndPutToMap(map)
                .returnToGoogleSearchResultsPage();

// Page 3
        searchResultUrl = searchResultsPage.getSearchResultUrl(3);
        webPage = searchResultsPage.openSearchResultByNumber(3);

        Assert.assertEquals(searchResultUrl, webPage.getCurrentUrl());

        webPage
                .parsePageTitleAndPutToMap(map)
                .returnToGoogleSearchResultsPage();


        System.out.println(map);
    }
}

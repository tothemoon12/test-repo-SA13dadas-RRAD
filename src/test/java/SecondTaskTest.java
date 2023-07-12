import org.testng.annotations.Test;
import pages.google.GoogleSearchMainPage;

import java.util.HashMap;
import java.util.Map;

public class SecondTaskTest extends BaseTest{
    @Test()
    public void test(){
        Map<String, String> map = new HashMap<>();

        new GoogleSearchMainPage(getDriver())
                .openPage()
                .enterSearchKey("Selenuim")
                .selectFirstResultFromListBox()

                .openSearchResultByNumber(1)
                .parsePageTitleAndPutToMap(map)
                .returnToGoogleSearchResultsPage()

                .openSearchResultByNumber(2)
                .parsePageTitleAndPutToMap(map)
                .returnToGoogleSearchResultsPage()

                .openSearchResultByNumber(3)
                .parsePageTitleAndPutToMap(map)
                ;
        System.out.println(map);
    }
}

package api;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import utils.PropsUtil;

import static utils.PropsUtil.getProperty;

public class BaseApiTest {

    @BeforeSuite
    public void setup(){
        RestAssured.baseURI = getProperty("api.base");
    }
}

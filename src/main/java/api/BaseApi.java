package api;

import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class BaseApi {
    public static Response getResponseBodyMap(String url) {
        return given()
                .when().get("/films")
                ;
    }

    public static Map<String, Object> getObjectMap(String path, String search) {
        return given()
                .queryParam("search", search)
                .when()
                .get(path)
                .then()
                .extract().body().jsonPath().getMap("results[0]");
    }

    public static Map<String, Object> getObjectMap(String path) {
        return given()
                .when()
                .get(path)
                .then()
                .extract().body().jsonPath().getMap("results[0]");
    }
    public static Map<String, Object> getObjectMapByUrl(String url){
        return given()
                .when()
                .get(url)
                .then()
                .extract().body().jsonPath().getMap("$");
    }
}

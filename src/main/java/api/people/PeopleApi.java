package api.people;

import api.BaseApi;

import java.util.Map;

public class PeopleApi extends BaseApi {
    public static Map<String, Object> getObjectMapByUrl(String url) {
        return getObjectMap(url);
    }
}

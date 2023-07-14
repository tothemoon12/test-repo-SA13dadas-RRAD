package api.films;

import api.BaseApi;

import java.util.Map;

public class FilmApi extends BaseApi {
    public static Map<String, Object> getFilmMapByTitle(String title) {
        return getObjectMap("/films", title);
    }
}

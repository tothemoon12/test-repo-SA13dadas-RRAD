package api.objects.factory;

import api.objects.builders.FilmBuilder;
import api.objects.models.Film;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

import static api.films.FilmApi.getFilmMapByTitle;

public class FilmFactory {
    public Film getFilmByTitle(String value){
        Map<String, Object> filmMap = getFilmMapByTitle(value);

        if (Objects.isNull(filmMap)) {
//            TBC
            return new FilmBuilder().build();
        }
        return new FilmBuilder()
                .setTitle((String) filmMap.get("title"))
                .setCharacters((ArrayList<String>) filmMap.get("characters"))
                .build();
    }
}

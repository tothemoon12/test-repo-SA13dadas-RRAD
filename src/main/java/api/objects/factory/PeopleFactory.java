package api.objects.factory;

import api.objects.builders.FilmBuilder;
import api.objects.builders.PeopleBuilder;
import api.objects.models.Film;
import api.objects.models.People;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

import static api.BaseApi.getObjectMapByUrl;
import static api.films.FilmApi.getFilmMapByTitle;


public class PeopleFactory {
    public People getPeopleByNameFromFilm(Film film, String nameToSearch){
        int i = 0;
        Map<String, Object> peopleObject = null;

        do {
            peopleObject = getObjectMapByUrl(film.getCharacters().get(i));
            i++;
        } while (!peopleObject.get("name").equals(nameToSearch) || i > film.getCharacters().size() || Objects.isNull(peopleObject));

        return new PeopleBuilder()
                .setName((String) peopleObject.get("name"))
                .setStarships((ArrayList<String>) peopleObject.get("starships"))
                .build();
    }
    public People  getPeopleByLink(String url){
        Map<String, Object> peopleObjectMap = getObjectMapByUrl(url);
        return new PeopleBuilder()
                .setName((String) peopleObjectMap.get("name"))
                .build();
    }
}

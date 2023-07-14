package api.objects.factory;

import api.objects.builders.PeopleBuilder;
import api.objects.builders.StarshipBuilder;
import api.objects.models.People;
import api.objects.models.Starship;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

import static api.BaseApi.getObjectMap;
import static api.BaseApi.getObjectMapByUrl;

public class StarshipFactory {
    public Starship getStarshipByUrl(String url) {
        Map<String, Object> starshipObject = getObjectMap(url);
        return new StarshipBuilder()
                .setName((String) starshipObject.get("name"))
                .setStarshipClass((String) starshipObject.get("starship_class"))
                .setPilots((ArrayList<String>) starshipObject.get("pilots"))
                .build();
    }

    public Starship findStarshipByPeopleStarships(People people, String starshipName) {
        int i = 0;
        Map<String, Object> starshipObjectMap = null;

        do {
            starshipObjectMap = getObjectMapByUrl(people.getStarships().get(i));
            i++;
        } while (!starshipObjectMap.get("starship_class").equals(starshipName) || i < people.getStarships().size() || Objects.isNull(starshipObjectMap));

        return new StarshipBuilder()
                .setName((String) starshipObjectMap.get("name"))
                .setPilots((ArrayList<String>) starshipObjectMap.get("pilots"))
                .setStarshipClass((String) starshipObjectMap.get("starship_class"))
                .build();
    }
}

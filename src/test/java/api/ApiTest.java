package api;

import api.objects.factory.FilmFactory;
import api.objects.factory.PeopleFactory;
import api.objects.factory.StarshipFactory;
import api.objects.models.Film;
import api.objects.models.People;
import api.objects.models.Starship;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ApiTest extends BaseApiTest {
    @Test
    public void test(){

        Film film = new FilmFactory().getFilmByTitle("A New Hope");
        People biggsDarklighter = new PeopleFactory().getPeopleByNameFromFilm(film, "Biggs Darklighter");
        Starship starship = new StarshipFactory().findStarshipByPeopleStarships(biggsDarklighter, "Starfighter");

        List<People> pilots = new ArrayList<>();
        for (String url:
                starship.getPilots()) {
            pilots.add(new PeopleFactory().getPeopleByLink(url));
        }
//        Assertions
        Assert.assertTrue(pilots.stream().map(People::getName).filter("Luke Skywalker"::equals).findFirst().isPresent());
        Assert.assertEquals(starship.getStarshipClass(), "Starfighter");
    }
}

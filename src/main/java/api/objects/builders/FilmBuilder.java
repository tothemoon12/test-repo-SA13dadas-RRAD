package api.objects.builders;

import api.objects.models.Film;

import java.util.ArrayList;
import java.util.Date;

public class FilmBuilder {
    private String title;
    private int episodeId;
    private String openingCrawl;
    private String director;
    private String producer;
    private String releaseDate;
    private ArrayList<String> characters;
    private ArrayList<String> planets;
    private ArrayList<String> starships;
    private ArrayList<String> vehicles;
    private ArrayList<String> species;
    private Date created;
    private Date edited;
    private String url;

    public FilmBuilder setTitle(String title) {
        this.title = title;
        return this;
    }
    public FilmBuilder setEpisodeId(int value) {
        this.episodeId = value;
        return this;
    }
    public FilmBuilder setOpeningCrawl(String value) {
        this.openingCrawl = value;
        return this;
    }
    public FilmBuilder setDirector(String value) {
        this.director = value;
        return this;
    }
    public FilmBuilder setProducer(String value) {
        this.producer = value;
        return this;
    }
    public FilmBuilder setReleaseDate(String value) {
        this.releaseDate = value;
        return this;
    }
    public FilmBuilder setCharacters(ArrayList<String> value) {
        this.characters = value;
        return this;
    }
    public FilmBuilder setPlanets(ArrayList<String> value) {
        this.planets = value;
        return this;
    }
    public FilmBuilder setStarships(ArrayList<String> value) {
        this.starships = value;
        return this;
    }
    public FilmBuilder setVehicles(ArrayList<String> value) {
        this.vehicles = value;
        return this;
    }
    public FilmBuilder setSpecies(ArrayList<String> value) {
        this.species = value;
        return this;
    }
    public FilmBuilder setUrl(String title) {
        this.url = title;
        return this;
    }
    public Film build(){
        return new Film(title, episodeId, openingCrawl,director,producer,releaseDate,characters,planets,starships, vehicles, species, created, edited, url);
    }
}

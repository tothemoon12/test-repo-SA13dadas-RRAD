package api.objects.models;

import java.util.ArrayList;
import java.util.Date;

public class Film {
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

    public String getTitle() {
        return title;
    }

    public Film setTitle(String title) {
        this.title = title;
        return this;
    }

    public int getEpisodeId() {
        return episodeId;
    }

    public Film setEpisodeId(int episodeId) {
        this.episodeId = episodeId;
        return this;
    }

    public String getOpeningCrawl() {
        return openingCrawl;
    }

    public Film setOpeningCrawl(String openingCrawl) {
        this.openingCrawl = openingCrawl;
        return this;
    }

    public String getDirector() {
        return director;
    }

    public Film setDirector(String director) {
        this.director = director;
        return this;
    }

    public String getProducer() {
        return producer;
    }

    public Film setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public Film setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public ArrayList<String> getCharacters() {
        return characters;
    }

    public Film setCharacters(ArrayList<String> characters) {
        this.characters = characters;
        return this;
    }

    public ArrayList<String> getPlanets() {
        return planets;
    }

    public Film setPlanets(ArrayList<String> planets) {
        this.planets = planets;
        return this;
    }

    public ArrayList<String> getStarships() {
        return starships;
    }

    public Film setStarships(ArrayList<String> starships) {
        this.starships = starships;
        return this;
    }

    public ArrayList<String> getVehicles() {
        return vehicles;
    }

    public Film setVehicles(ArrayList<String> vehicles) {
        this.vehicles = vehicles;
        return this;
    }

    public ArrayList<String> getSpecies() {
        return species;
    }

    public Film setSpecies(ArrayList<String> species) {
        this.species = species;
        return this;
    }

    public Date getCreated() {
        return created;
    }

    public Film setCreated(Date created) {
        this.created = created;
        return this;
    }

    public Date getEdited() {
        return edited;
    }

    public Film setEdited(Date edited) {
        this.edited = edited;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Film setUrl(String url) {
        this.url = url;
        return this;
    }

    public Film(String title, int episodeId, String openingCrawl, String director, String producer, String releaseDate, ArrayList<String> characters, ArrayList<String> planets, ArrayList<String> starships, ArrayList<String> vehicles, ArrayList<String> species, Date created, Date edited, String url) {
        this.title = title;
        this.episodeId = episodeId;
        this.openingCrawl = openingCrawl;
        this.director = director;
        this.producer = producer;
        this.releaseDate = releaseDate;
        this.characters = characters;
        this.planets = planets;
        this.starships = starships;
        this.vehicles = vehicles;
        this.species = species;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }
}


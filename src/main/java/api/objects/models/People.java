package api.objects.models;

import java.util.ArrayList;
import java.util.Date;

public class People {
    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private ArrayList<String> films;
    private ArrayList<String> species;
    private ArrayList<String> vehicles;
    private ArrayList<String> starships;
    private Date created;
    private Date edited;
    private String url;

    public People(String name, String height, String mass, String hair_color, String skin_color, String eye_color, String birth_year, String gender, String homeworld, ArrayList<String> films, ArrayList<String> species, ArrayList<String> vehicles, ArrayList<String> starships, Date created, Date edited, String url) {
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hair_color = hair_color;
        this.skin_color = skin_color;
        this.eye_color = eye_color;
        this.birth_year = birth_year;
        this.gender = gender;
        this.homeworld = homeworld;
        this.films = films;
        this.species = species;
        this.vehicles = vehicles;
        this.starships = starships;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public People setName(String name) {
        this.name = name;
        return this;
    }

    public String getHeight() {
        return height;
    }

    public People setHeight(String height) {
        this.height = height;
        return this;
    }

    public String getMass() {
        return mass;
    }

    public People setMass(String mass) {
        this.mass = mass;
        return this;
    }

    public String getHair_color() {
        return hair_color;
    }

    public People setHair_color(String hair_color) {
        this.hair_color = hair_color;
        return this;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public People setSkin_color(String skin_color) {
        this.skin_color = skin_color;
        return this;
    }

    public String getEye_color() {
        return eye_color;
    }

    public People setEye_color(String eye_color) {
        this.eye_color = eye_color;
        return this;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public People setBirth_year(String birth_year) {
        this.birth_year = birth_year;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public People setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public People setHomeworld(String homeworld) {
        this.homeworld = homeworld;
        return this;
    }

    public ArrayList<String> getFilms() {
        return films;
    }

    public People setFilms(ArrayList<String> films) {
        this.films = films;
        return this;
    }

    public ArrayList<String> getSpecies() {
        return species;
    }

    public People setSpecies(ArrayList<String> species) {
        this.species = species;
        return this;
    }

    public ArrayList<String> getVehicles() {
        return vehicles;
    }

    public People setVehicles(ArrayList<String> vehicles) {
        this.vehicles = vehicles;
        return this;
    }

    public ArrayList<String> getStarships() {
        return starships;
    }

    public People setStarships(ArrayList<String> starships) {
        this.starships = starships;
        return this;
    }

    public Date getCreated() {
        return created;
    }

    public People setCreated(Date created) {
        this.created = created;
        return this;
    }

    public Date getEdited() {
        return edited;
    }

    public People setEdited(Date edited) {
        this.edited = edited;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public People setUrl(String url) {
        this.url = url;
        return this;
    }
}
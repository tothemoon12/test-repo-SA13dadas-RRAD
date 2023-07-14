package api.objects.builders;

import api.objects.models.People;

import java.util.ArrayList;
import java.util.Date;

public class PeopleBuilder {
    private String name;
    private String height;
    private String mass;
    private String hairColor;
    private String skinColor;
    private String eyeColor;
    private String birthYear;
    private String gender;
    private String homeworld;
    private ArrayList<String> films;
    private ArrayList<String> species;
    private ArrayList<String> vehicles;
    private ArrayList<String> starships;
    private Date created;
    private Date edited;
    private String url;

    public PeopleBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PeopleBuilder setHeight(String height) {
        this.height = height;
        return this;
    }

    public PeopleBuilder setMass(String mass) {
        this.mass = mass;
        return this;
    }

    public PeopleBuilder setHairColor(String hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public PeopleBuilder setSkinColor(String skinColor) {
        this.skinColor = skinColor;
        return this;
    }

    public PeopleBuilder setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        return this;
    }

    public PeopleBuilder setBirthYear(String birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public PeopleBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public PeopleBuilder setHomeworld(String homeworld) {
        this.homeworld = homeworld;
        return this;
    }

    public PeopleBuilder setFilms(ArrayList<String> films) {
        this.films = films;
        return this;
    }

    public PeopleBuilder setSpecies(ArrayList<String> species) {
        this.species = species;
        return this;
    }

    public PeopleBuilder setVehicles(ArrayList<String> vehicles) {
        this.vehicles = vehicles;
        return this;
    }

    public PeopleBuilder setStarships(ArrayList<String> starships) {
        this.starships = starships;
        return this;
    }

    public PeopleBuilder setCreated(Date created) {
        this.created = created;
        return this;
    }

    public PeopleBuilder setEdited(Date edited) {
        this.edited = edited;
        return this;
    }

    public PeopleBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public People build(){
        return new People(name, height, mass, hairColor, skinColor, eyeColor, birthYear, gender, homeworld, films, species, vehicles, starships, created, edited, url);
    }
}

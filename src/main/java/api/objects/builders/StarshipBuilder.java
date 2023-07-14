package api.objects.builders;

import api.objects.models.Starship;

import java.util.ArrayList;
import java.util.Date;

public class StarshipBuilder {
    private String name;
    private String model;
    private String manufacturer;
    private String costInCredits;
    private String length;
    private String maxAtmospheringSpeed;
    private String crew;
    private String passengers;
    private String cargoCapacity;
    private String consumables;
    private String hyperdriveRating;
    private String mGLT;
    private String starshipClass;
    private ArrayList<String> pilots;
    private ArrayList<String> films;
    private Date created;
    private Date edited;
    private String url;

    public Starship build() {
        return new Starship(name, model, manufacturer, costInCredits, length, maxAtmospheringSpeed, crew, passengers, cargoCapacity, consumables, hyperdriveRating, mGLT, starshipClass, pilots, films, created, edited, url);
    }

    public StarshipBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StarshipBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public StarshipBuilder setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public StarshipBuilder setCostInCredits(String costInCredits) {
        this.costInCredits = costInCredits;
        return this;
    }

    public StarshipBuilder setLength(String length) {
        this.length = length;
        return this;
    }

    public StarshipBuilder setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
        return this;
    }

    public StarshipBuilder setCrew(String crew) {
        this.crew = crew;
        return this;
    }

    public StarshipBuilder setPassengers(String passengers) {
        this.passengers = passengers;
        return this;
    }

    public StarshipBuilder setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        return this;
    }

    public StarshipBuilder setConsumables(String consumables) {
        this.consumables = consumables;
        return this;
    }

    public StarshipBuilder setHyperdriveRating(String hyperdriveRating) {
        this.hyperdriveRating = hyperdriveRating;
        return this;
    }

    public StarshipBuilder setmGLT(String mGLT) {
        this.mGLT = mGLT;
        return this;
    }

    public StarshipBuilder setStarshipClass(String starshipClass) {
        this.starshipClass = starshipClass;
        return this;
    }

    public StarshipBuilder setPilots(ArrayList<String> pilots) {
        this.pilots = pilots;
        return this;
    }

    public StarshipBuilder setFilms(ArrayList<String> films) {
        this.films = films;
        return this;
    }

    public StarshipBuilder setCreated(Date created) {
        this.created = created;
        return this;
    }

    public StarshipBuilder setEdited(Date edited) {
        this.edited = edited;
        return this;
    }

    public StarshipBuilder setUrl(String url) {
        this.url = url;
        return this;
    }
}

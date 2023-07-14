package api.objects.models;

import java.util.ArrayList;
import java.util.Date;

public class Starship {
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

    public Starship(String name, String model, String manufacturer, String costInCredits, String length, String maxAtmospheringSpeed, String crew, String passengers, String cargoCapacity, String consumables, String hyperdriveRating, String mGLT, String starshipClass, ArrayList<String> pilots, ArrayList<String> films, Date created, Date edited, String url) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.costInCredits = costInCredits;
        this.length = length;
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
        this.crew = crew;
        this.passengers = passengers;
        this.cargoCapacity = cargoCapacity;
        this.consumables = consumables;
        this.hyperdriveRating = hyperdriveRating;
        this.mGLT = mGLT;
        this.starshipClass = starshipClass;
        this.pilots = pilots;
        this.films = films;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public Starship setName(String name) {
        this.name = name;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Starship setModel(String model) {
        this.model = model;
        return this;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Starship setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public String getCostInCredits() {
        return costInCredits;
    }

    public Starship setCostInCredits(String costInCredits) {
        this.costInCredits = costInCredits;
        return this;
    }

    public String getLength() {
        return length;
    }

    public Starship setLength(String length) {
        this.length = length;
        return this;
    }

    public String getMaxAtmospheringSpeed() {
        return maxAtmospheringSpeed;
    }

    public Starship setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
        return this;
    }

    public String getCrew() {
        return crew;
    }

    public Starship setCrew(String crew) {
        this.crew = crew;
        return this;
    }

    public String getPassengers() {
        return passengers;
    }

    public Starship setPassengers(String passengers) {
        this.passengers = passengers;
        return this;
    }

    public String getCargoCapacity() {
        return cargoCapacity;
    }

    public Starship setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        return this;
    }

    public String getConsumables() {
        return consumables;
    }

    public Starship setConsumables(String consumables) {
        this.consumables = consumables;
        return this;
    }

    public String getHyperdriveRating() {
        return hyperdriveRating;
    }

    public Starship setHyperdriveRating(String hyperdriveRating) {
        this.hyperdriveRating = hyperdriveRating;
        return this;
    }

    public String getmGLT() {
        return mGLT;
    }

    public Starship setmGLT(String mGLT) {
        this.mGLT = mGLT;
        return this;
    }

    public String getStarshipClass() {
        return starshipClass;
    }

    public Starship setStarshipClass(String starshipClass) {
        this.starshipClass = starshipClass;
        return this;
    }

    public ArrayList<String> getPilots() {
        return pilots;
    }

    public Starship setPilots(ArrayList<String> pilots) {
        this.pilots = pilots;
        return this;
    }

    public ArrayList<String> getFilms() {
        return films;
    }

    public Starship setFilms(ArrayList<String> films) {
        this.films = films;
        return this;
    }

    public Date getCreated() {
        return created;
    }

    public Starship setCreated(Date created) {
        this.created = created;
        return this;
    }

    public Date getEdited() {
        return edited;
    }

    public Starship setEdited(Date edited) {
        this.edited = edited;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Starship setUrl(String url) {
        this.url = url;
        return this;
    }
}

package Egor.example.data;
import  java.time.LocalDateTime;
import com.google.gson.internal.LinkedTreeMap;
public class City {

    private long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private float area; //Значение поля должно быть больше 0, Поле не может быть null
    private long population; //Значение поля должно быть больше 0
    private double metersAboveSeaLevel;
    private boolean capital; //Поле не может быть null
    private double populationDensity; //Значение поля должно быть больше 0
    private Climate climate; //Поле не может быть null
    private Human governor; //Поле не может быть null

    public City(long id, String name, Coordinates coordinates, java.time.LocalDateTime creationDate, float area, long population, double metersAboveSeaLevel, boolean capital, double populationDensity, Climate climate, Human governor) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = (creationDate);
        this.area = area;
        this.population = population;
        this.metersAboveSeaLevel = metersAboveSeaLevel;
        this.capital = capital;
        this.populationDensity = populationDensity;
        this.climate = climate;
        this.governor = governor;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public java.time.LocalDateTime getCreationDate() {
        return creationDate;
    }

    public float getArea() {
        return area;
    }

    public long getPopulation() {
        return population;
    }

    public double getMetersAboveSeaLevel() {
        return metersAboveSeaLevel;
    }

    public boolean isCapital() {
        return capital;
    }

    public double getPopulationDensity() {
        return populationDensity;
    }

    public Climate getClimate() {
        return climate;
    }

    public Human getGovernor() {
        return governor;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate='" + creationDate.toString() + '\'' +
                ", area=" + area +
                ", population=" + population +
                ", metersAboveSeaLevel=" + metersAboveSeaLevel +
                ", capital=" + capital +
                ", populationDensity=" + populationDensity +
                ", climate=" + climate +
                ", governor=" + governor +
                '}';
    }
}

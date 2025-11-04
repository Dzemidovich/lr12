package by.enot.state;

public class District {
    private String name;
    private City[] cities;
    private int cityCount;

    public District(String name) {
        this.name = name;
        this.cities = new City[10];
        this.cityCount = 0;
    }

    public void addCity(City city) {
        if (cityCount < 10) {
            cities[cityCount] = city;
            cityCount++;
        } else {
            System.out.println("Нельзя добавить больше 10 городов в район");
        }
    }

    public String getName() {
        return name;
    }

    public int getCityCount() {
        return cityCount;
    }

    public City[] getCities() {
        return cities;
    }

    @Override
    public String toString() {
        return "Район: " + name + " (" + cityCount + " городов)";
    }
}
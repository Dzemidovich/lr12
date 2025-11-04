package by.enot.state;

public class State {
    private String name;
    private Region[] regions;
    private int regionCount;

    public State(String name) {
        this.name = name;
        this.regions = new Region[10]; // максимум 10 областей
        this.regionCount = 0;
    }

    public void addRegion(Region region) {
        if (regionCount < 10) {
            regions[regionCount] = region;
            regionCount++;
        } else {
            System.out.println("Нельзя добавить больше 10 областей в государство");
        }
    }

    public void printStructure() {
        System.out.println("Государство: " + name);
        for (int i = 0; i < regionCount; i++) {
            Region region = regions[i];
            System.out.println("  " + region);
            for (int j = 0; j < region.getDistrictCount(); j++) {
                District district = region.getDistricts()[j];
                System.out.println("    " + district);
                for (int k = 0; k < district.getCityCount(); k++) {
                    City city = district.getCities()[k];
                    System.out.println("      " + city);
                }
            }
        }
    }

    public String getName() {
        return name;
    }
}
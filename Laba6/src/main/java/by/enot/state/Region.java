package by.enot.state;

public class Region {
    private String name;
    private District[] districts;
    private int districtCount;

    public Region(String name) {
        this.name = name;
        this.districts = new District[10];
        this.districtCount = 0;
    }

    public void addDistrict(District district) {
        if (districtCount < 10) {
            districts[districtCount] = district;
            districtCount++;
        } else {
            System.out.println("Нельзя добавить больше 10 районов в область");
        }
    }

    public String getName() {
        return name;
    }

    public int getDistrictCount() {
        return districtCount;
    }

    public District[] getDistricts() {
        return districts;
    }

    @Override
    public String toString() {
        return "Область: " + name + " (" + districtCount + " районов)";
    }
}
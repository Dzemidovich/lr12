package by.enot.state;

public class MainState {
    public static void main(String[] args) {
        City minsk = new City("Минск");
        City borisov = new City("Борисов");
        City grodno = new City("Гродно");
        City lida = new City("Лида");

        District minskDistrict = new District("Минский район");
        minskDistrict.addCity(minsk);
        minskDistrict.addCity(borisov);

        District grodnoDistrict = new District("Гродненский район");
        grodnoDistrict.addCity(grodno);
        grodnoDistrict.addCity(lida);

        Region minskRegion = new Region("Минская область");
        minskRegion.addDistrict(minskDistrict);

        Region grodnoRegion = new Region("Гродненская область");
        grodnoRegion.addDistrict(grodnoDistrict);

        State belarus = new State("Республика Беларусь");
        belarus.addRegion(minskRegion);
        belarus.addRegion(grodnoRegion);

        belarus.printStructure();
    }
}
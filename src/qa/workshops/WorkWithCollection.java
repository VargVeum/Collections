package qa.workshops;

import java.util.ArrayList;

public class WorkWithCollection {
    public void createCities() {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Kyiv");
        showCities(cities);

        String myCity = "Dnepr";
        if(!cities.contains(myCity)){
            cities.add(myCity);
        }
        showCities(cities);

//        cities.remove(myCity);
//        cities.indexOf("Kyiv");
    }



    private void showCities(ArrayList<String> cities) {
        for (String city:cities){
            System.out.println(city);
        }
        System.out.println();
    }




}

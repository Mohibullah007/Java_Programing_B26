package day61_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Countries {
    public static void main(String[] args) {

        Map<String, ArrayList<String>> countries = new HashMap<>();

        countries.put("United States", new ArrayList<>(Arrays.asList("Chicago", "New York", "Dallas", "DC", "Denver", "LA")));

        countries.put("Turkey", new ArrayList<>(Arrays.asList("Istanbul", "Ankara", "Izmir")));

        countries.put("Canada", new ArrayList<>(Arrays.asList("Quebec", "Toronto", "Vancouver")));

        System.out.println(countries);

        // print all cities that start with D or I

        // Print all cities that start with D or I

        for (ArrayList<String> cities : countries.values()) { // iterates through the values of the map, which are the ArrayList of cities

            for (String eachCity : cities) { // iterates through each city in each ArrayList value

                if (eachCity.startsWith("D") || eachCity.startsWith("I")) {
                    System.out.println(eachCity);
                }

            }

        }

    }
}

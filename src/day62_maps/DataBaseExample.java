package day62_maps;

import java.util.*;

public class DataBaseExample {

    public static void main(String[] args) {

        /*

        people
            FIRST_NAME: James
            LAST_NAME: Bond
            BATCH: 7
         */

        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", "James");
        map.put("LAST_NAME", "Bond");
        map.put("BATCH", "7");

        System.out.println(map);
        // List<String> list of String elements

        List < Map<String, String> > list = new ArrayList<>();
        list.add(map); // index 0
        list.add(makeMap("Shina", "Alhusaini", "26")); // index 1
        list.add(makeMap("Dzera", "Temiraeva", "20")); // index 2
        list.add(makeMap("Diana", "Bulgac", "19")); // index 3
        list.add(makeMap("Sabrina", "Badirli", "26")); // index 4
        list.add(makeMap("Ali", "Dokumaci", "16")); // index 5

        // how can I check the last name of the map I just added
        System.out.println(list.get(1).get("FIRST_NAME")); // first get is from the list by index, then we have to get
        // method from map to give the value by the key
        System.out.println(list.get(1).get("LAST_NAME"));

        System.out.println("-----------------------------------------------------------------------------------------");

        // go through the ArrayList of Map elements  -  the map element are the information for each person

        for (Map<String, String> each : list){
            System.out.println(each);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        // go through all the people and print all the first names

        for (Map<String, String> each : list){
            System.out.println(each.get("FIRST_NAME")); // each is each map, the maps are the people's information
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        for (Map<String, String> each : list){
            if (Integer.parseInt(each.get("BATCH")) >= 20){
                System.out.println(each.get("FIRST_NAME"));
            }
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        // Print the information of the last person in my List

        System.out.println("Fist name: " + list.get(list.size() -1).get("FIRST_NAME"));
        System.out.println("Last name: " + list.get(list.size() -1).get("LAST_NAME"));
        System.out.println("Batch: " + list.get(list.size() -1).get("BATCH"));

    }

    public static Map<String, String> makeMap (String ... values){
        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", values[0]);
        map.put("LAST_NAME", values[1]);
        map.put("BATCH", values[2]);
        return map;
    }
}

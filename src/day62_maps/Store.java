package day62_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        Map<String, Double> store = new HashMap<>();
        store.put("Water", 1.5);
        store.put("Coffee", 2.5);
        store.put("Apples", 0.99);
        store.put("Bread", 2.35);
        store.put("Cucumbers", 3.89);

        System.out.println("Store Inventory");

//        for (String key : store.keySet()){
//            System.out.println("Item: " + key + " for $" + store.get(key));
//        }

        for (Map.Entry<String, Double> each : store.entrySet()){ // todo: return the entry (key/va;ue pairs) from the map
            System.out.println("Item: " + each.getKey() + " for $" + each.getValue());// todo; getValue method is the method from the entry, which gives value of the current entry
        }
        System.out.println("---------------------------------------------------");
        System.out.println(store.values()); //todo: returns the values from map as a collection type


        System.out.println("---------------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("What item do you want?");
        String item = input.nextLine();

        System.out.println(store.containsKey(item) ? item + " is in stock for $" + store.get(item) : "Not available in the store");

    }
}

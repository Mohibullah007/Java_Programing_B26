package day28_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which item are you looking for");
        String q = input.nextLine().toLowerCase();
        String [] items = {"Shoes", "Jacket", "Gloves", "Airpods", "IPad"};
        boolean hasJacket = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(q)){
            hasJacket = true;
            break;
            }
        }
        System.out.println(hasJacket ? "Jackets in Stock" : "Jackets out of Stock");
        System.out.println(Arrays.toString(items).toLowerCase().contains(q));
    }
}

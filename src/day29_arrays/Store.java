package day29_arrays;

public class Store {
    /*
            String [] items = { "Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack" };
        double [] prices = { 89.99, 150.0, 999.99, 250.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350 };
     */
    public static void main(String[] args) {
        String [] items = { "Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack" };
        double [] prices = { 89.99, 150.0, 999.99, 250.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350 };

        for (int i = 0; i < items.length; i++) {
            System.out.println("Item Id: " + itemIds[i] + " are " + items[i] + " and they cost $" + prices[i]);

        }
        System.out.println("=================");
        // Task: Find the index of the Gloves

        int indexOfGloves = -1; // we set -1 as default, so that if gloves is not found in the array it will always give -1
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")){
                indexOfGloves = i;
                break;
            }
        }
        System.out.println("Index of Gloves " + indexOfGloves);
    }
}

package day05_variables;
/*
// add main method
//declare and assign these variables:
//
//    brand, color, price, waterResistant, isSmart
*/

public class WatchInfo {
    public static void main(String[] args) {
        String brand = "Apple";
        String color = "Black";
        int price = 485;
        boolean waterResident = true;
        boolean isSmart = true;

        System.out.println("\n\tI have a watch from " + brand + ", it is " + color + ", and I bought it $" + price);
        System.out.println("\n\tFeatures:\n\t  Is it Water resistant:\t" + waterResident +
                "\n\t  Is it Smart:\t" + isSmart);
    }
}

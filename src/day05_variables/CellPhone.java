package day05_variables;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "iPhone 13 Pro Max";
        String color = "Blue";
        double price = 1350.25;
        int storage = 512;
        boolean camera = true;
        String sim = "T-Mobile";

        System.out.println("\t I have " + model + " from " + brand + " the color is " + color + ", \n\t with Storage of " + storage + "GB, good camera: " + camera + ",\n\t and I bought it on $" + price);


        String fullMassege = "\t I have " + model + " from " + brand + " the color is " + color + ", \n\t with Storage of " + storage + "GB, good camera: " + camera + ",\n\t and I bought it on $" + price;


        System.out.println("\n\t*****************************************************************\n\n" +fullMassege);

    }


}

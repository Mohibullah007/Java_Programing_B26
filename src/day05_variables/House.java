package day05_variables;
/*
Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic,
         is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
 */
public class House {
    public static void main(String[] args) {
        String houseType = "Single House";
        byte numberOfBedrooms = 4;
        byte numberOfBathroom = 3;
        int numberOfKitchen = 1;
        boolean thereIsBasement = true;
        boolean isThereAttic = false;
        boolean isTherePool = true;
        boolean isTheHouseForSale = false;
        int price = 1_000_000;
        String address = "Fredericksburg VA, United State";
        int zipCode = 22411;
        boolean isThereParkNearBy = true;
        String Ratting = "5 out of 5";


        System.out.println("  House Type\n\t" + houseType + " with " + numberOfBedrooms + " bedrooms, "+numberOfBathroom +
                " bathrooms and "+ numberOfKitchen+" Kitchen.");
        System.out.println("\tDoes it have Basement:\t" + thereIsBasement);
        System.out.println("\n\tIs it have Pool:\t" + isTherePool + "\n\tIs there Attic:\t"+isThereAttic+
                "\n\tIs there park near by:\t" + isThereParkNearBy+"\n\tEstimated Price:\t"+price+"\n\tZip code:\t"+zipCode
                +"\n\tNumber of schools nearby:\t"+Ratting+"\n\tAddress:\t" +address+"\n\tIs it for sale:\t"
                +isTheHouseForSale);
    }
}

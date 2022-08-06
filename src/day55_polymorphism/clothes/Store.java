package day55_polymorphism.clothes;

public class Store {
    public static void main(String[] args) {

        // All possible objects of TShirt

        TShirt tshirt1 = new TShirt(); // reference of itself
        tshirt1.wear();

        Clothes tshirt2 = new TShirt(); // reference of parent
        tshirt2.wear();

        Object tshirt3 = new TShirt();
//        tshirt3.wear(); Object class does not have reference to the wear() method

//        HasHood tshirt4 = new TShirt(); Tshirt class does not implement HasHood interface

        // -------------------------------


    }
}

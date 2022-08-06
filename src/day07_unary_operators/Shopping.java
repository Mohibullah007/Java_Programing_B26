package day07_unary_operators;

public class Shopping {

    public static void main(String[] args) {
        int numberOfItems = 0;
        double price = 0.0;

        System.out.println("Pick up 1 water");
        System.out.println("how many items in the cart: "  + ++numberOfItems);
        price = price + 2.5; // take the price value, 0, and add 2.5, and they reassign to the price variable.

        System.out.println("we pick up 2 eggs");
        System.out.println("how many items in the cart: "  + ++numberOfItems);
        System.out.println("how many items in the cart: "  + ++numberOfItems);

        System.out.println("how many items in the cart: "  + numberOfItems++); // we order to read the value and after that add a value. so the printing
    }

}

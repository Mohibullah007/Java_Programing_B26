package day04_variables;

import java.util.function.DoubleToIntFunction;

public class Fruits {
    public static void main(String[] args) {
        int apples = 50;
        int grapes = 100;
        int bananas = 150;

        System.out.println("\n\tHow many apples do we have:\t" + apples);// we use + to add variables with characters, to make a massage.
        System.out.println("\n\thow many of grapes do we have:\t" + grapes);
        System.out.println("\n\tHow many bananas do we have:\t" + bananas);

        System.out.println("\n \tsold some apples");
        apples = 25;
        System.out.println("\n \tapples after selling:\t" + apples);


        // System.out.println("The price of my 25 apples is $20");
        System.out.println("\n\tThe price of " + apples + " apples is $20");

        int price = 20;
        System.out.println("\n\n\tThe price of " + apples + " apples is $" + price);
    }
}

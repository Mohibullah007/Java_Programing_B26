package day13_if_statement;

import java.util.Scanner;

public class Fuel {
    /*
create a class Diver

You are diving in the ocean. Your oxygen tank has a certain level (number)

declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

    Above 90 - Your tank is full
    Above 80 - Still okay
   	Above 70 - Don't go too far
   	Above 60 - Start to head back
    Above 50 - Be careful now you at at 50%
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please put your current fuel");
        int fuel = input.nextInt();
        //String massage;
        if (fuel > 90) {
            System.out.println("your tank is full"); //massage = ("your tank is full");
        } else if (fuel > 80) {
            System.out.println("Still okay"); //    massage = ("Still okay");
        } else if (fuel > 70) {
            System.out.println("Don't go too far");   // massage = ("Don't go too far");
        } else if (fuel > 60) {
            System.out.println("Start to head back"); //massage = ("Start to head back");
        } else if (fuel > 50) {
            System.out.println("Be careful now you have 50% fuel");  //massage = ("Be careful now you have 50% fuel");
        }
    }

}
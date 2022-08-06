package day23_loops;


import java.util.Scanner;

public class Number {
    /*

        Task:
            declare and assign a number

            print all the multiplication results for 1 through 10

            Ex:
                4

                4 x 1 = 4
                4 x 2 = 8
                ..
                4 x 10 = 40

     */

    public static void main(String[] args) {


        int number = 4;
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));

        }
    }
}


package day22_loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        enter number 1
            -> type number

       enter number 2
            -> type number

       enter number 3
            -> type number

       enter number 4
            -> type number

       enter number 5
            -> type number
         */

        int num = 1;
        int total = 0;

        while (num <= 5){
            System.out.println("Enter number " + num);
            num++;
            total += input.nextInt();
        }
        System.out.println(total);
    }
}

package day23_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int min = 0;

        int n = 0;

        while (n < 5){
            n++;
            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

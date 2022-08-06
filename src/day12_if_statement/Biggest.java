package day12_if_statement;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers. Use enter after each");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextByte();


        if (num1 > num2 && num1 > num3){
            System.out.println("Number 1 is the biggest ");
        } else  if (num2 > num1 && num2 > num3){
            System.out.println("Number 2 is the biggest ");
        } else {
            System.out.println(num3 + " is the biggest number");
        }

    }
}

package day09_Scanners;
/*
        create Scanner object
        ask the user to enter 3 numbers
        find and print the sum of the numbers
 */
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        System.out.println("Print Number 1:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();


        System.out.println("Print Number 2: ");
        Scanner keyboard = new Scanner(System.in);
        double num2 = keyboard.nextDouble();

        System.out.println("Print Number: ");
        Scanner output = new Scanner(System.in);
        byte num3 = output.nextByte();

        System.out.println("Give me the last Figure: "+(num + num2 / num3));
    }


}

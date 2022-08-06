package day09_Scanners;
import com.sun.javafx.geom.BaseBounds;

import java.util.Scanner;
public class CompareNumbers {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Number 1: ");

        int number = keyboard.nextInt();

        System.out.println("Enter Number 2: ");
        double number1 = keyboard.nextDouble();

        System.out.println("The Numbers are equal: "+ (number == number1));


    }
}

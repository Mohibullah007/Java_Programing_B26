package day33_methods;

import java.util.Scanner;

public class Age {
    public static void age(int current){
        System.out.println("Your birth year is " + (2022 - current));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age1 = input.nextInt();
        age(age1);
        System.out.println("Age: " + age1);
    }
}

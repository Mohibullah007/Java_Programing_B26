package day20_string;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = input.next().trim().toLowerCase();
        System.out.println("Enter your last name:");
        String lastName = input.next().trim().toLowerCase();


        String first = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        String last = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        System.out.println(first+" "+last);
    }
}

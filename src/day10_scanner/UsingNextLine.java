package day10_scanner;
import java.util.Scanner;
public class UsingNextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is today");
        String day = input.nextLine();

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Today: "+ day);
        System.out.println("First name " + firstName);
        System.out.println("Last name " + lastName);

    }
}

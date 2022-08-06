package day19_string;
import java.util.Scanner;
public class CharExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next().toUpperCase();
        System.out.println("Enter your last name");
        String lastName = input.next().toUpperCase();

        System.out.println("Hello: "+firstName.charAt(0) + lastName.charAt(0));

    }
}
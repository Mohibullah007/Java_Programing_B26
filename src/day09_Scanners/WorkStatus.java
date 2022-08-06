package day09_Scanners;
import java.util.Scanner;
public class WorkStatus {

    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Please enter your last name:");
        String lastName = input.next();
        System.out.println("Are you Employee?");
        boolean employee = input.nextBoolean();
        System.out.println("Are you student?");
        boolean student = input.nextBoolean();

        System.out.println("Thank you "+name+" "+lastName+" for joining our website");


    }
}

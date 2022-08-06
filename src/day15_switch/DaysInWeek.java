package day15_switch;

import java.util.Scanner;

public class DaysInWeek {
    /*
      Given a day number, find and print the day related to the number

      1- Monday
      2- Tuesday

      6- Saturday
      7- Sunday
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of the day of the week");
        int num = input.nextInt();
        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satereday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid Number");





        }
    }
}

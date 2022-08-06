package day15_switch;

import java.util.Scanner;

public class DaysInWeek2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day Number 1-7");
        int num = input.nextInt();

        String day = "";

        switch (num){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid Number";
                break;
        }
        System.out.println(day
        );
    }
}

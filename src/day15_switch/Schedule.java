package day15_switch;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter current day ");
        String num = input.nextLine();
        String day = "";

        switch (num){
            case "Monday": case "Mon": case "monday":
                day = "Week day, you have java class from 7pm to 10pm est";
                break;
            case "Tuesday": case "tuesday": case "tue":
                day = "Week day, you have java class from 7pm to 10pm est";
                break;
            case "Wednesday": case "wednesday": case "wed":
                day = "Week day, you have java class from 7pm to 10pm est";
                break;
            case "Thursday": case "thursday": case "thu":
                day = "Week day, you have Soft Skills class from 7pm to 10pm est";
                break;
            case "Friday": case "friday": case "fri":
                day = "Week day, are off but you have a group meeting with your mentor";
                break;
            case "Saturday": case "saturday": case "sat":
                day = "Off day, you have full day java class from 10 am to 5pm est";
                break;
            case "Sunday": case "sunday": case "sun":
                day = "Off day, you have full day java class from 10 am to 5pm est";
                break;
            default:
                day = "Invalid day, Please check you spelling";
        }
        System.out.println(day);
    }
}

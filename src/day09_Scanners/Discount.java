package day09_Scanners;

public class Discount {
    public static void main(String[] args) {

        String weekDay = "sutarday";

        boolean isTheWeekend = true;
        boolean isTeacher = false;
        boolean isPoliceOfficer = false;
        boolean isFireFighter = true;

        boolean discount = isTheWeekend && (isTeacher || isPoliceOfficer || isFireFighter);

        System.out.println(discount);

    }
}

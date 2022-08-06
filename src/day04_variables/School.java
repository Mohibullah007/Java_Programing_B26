package day04_variables;

public class School {
    public static void main(String[] args) {
        int school1= 50;
        int school2 = 54;
        int school3 = 61;
        int school4 = 48;
        int school5 = 50;

        int total = school1 + school2 + school3 + school4 +school5;

        System.out.println("school1 = " + school1);  // soutv is using for numbers to determine the print out more essy.
        System.out.println("school2 = " + school2);
        System.out.println("school3 = " + school3);
        System.out.println("school4 = " + school4);
        System.out.println("school5 = " + school5);
        System.out.println("total = " + total);

        double days = 210.5;
        double snow = 0.08;
        double GPA = 2.9;
        System.out.println("there is " + days +" on days in a year.");
        System.out.println("the Snow is about " + snow + " days in a year.");
        System.out.println("Student average GPA is  " + GPA + " out of (1.5 - 4.0)  ");
    }
}

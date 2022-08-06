package day11_if_statement;

public class IfElseStatement {
    public static void main(String[] args) {

        int num = 75;
        if (num >= 75) {
            System.out.println("pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println("***************************************");
        int year = 2022;
        boolean lockdown = year == 2020 || year == 2021;
        if (lockdown){
        System.out.println("Stay home \nPractice java\nWear mask");

        } else {
        System.out.println("Go party\nStill practice java");
    }
    }
}



package day11_if_statement;

public class SingleIfStatement {
    public static void main(String[] args) {
        if (false){  // becuase the boolean is false therefore we have noting to print
            System.out.println("hello world");
        }
        System.out.println("Hello World"); // it print what we order because we order it out of if statement

        if(true){
            System.out.println("today is monday");
        }

        int score =80;
        if (score >= 75){
            System.out.println("Pass");
        }
        int score1 = 60;
        if (score1 < 75){
            System.out.println("Fail");
        }
        System.out.println("**********************");
        int year = 2020;
        boolean lockdown = year == 2020 || year == 2021;
        if ( lockdown ) {
            System.out.println("Stay at home");
            System.out.println("Practice java");
            System.out.println("Wear mask");
        }

        System.out.println("***********************");
        int year1 = 2022;
        boolean lockdown1 = year1 == 2020 || year1 == 2021;
        if ( !lockdown1 ) {
            System.out.println("you can party ");
            System.out.println("Still Practice java");
            System.out.println("Maybe Travel");
        }

    }
}

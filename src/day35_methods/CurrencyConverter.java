package day35_methods;

import java.util.Scanner;

public class CurrencyConverter {
    public static double convert(String type, double amount){

        switch (type.toLowerCase()){
            case "euro":
                return  amount * 0.91;
            case "yen":
                return amount * 121.03;
            case "lira":
                return amount * 14.85;
            case "won":
                return amount * 1217.52;
            case "rupee":
                return amount * 181.45;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1)\tEnter currency type\n2)\tEnter your converting amount ");
        System.out.println(convert(input.next(), input.nextDouble()));
    }
}

package day19_string;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name with title");
        String name = input.nextLine().toLowerCase();

        if (name.startsWith("mr") || name.startsWith("mister")){
            System.out.println("Hello Sir ");
        }else if (name.startsWith("ms") || name.startsWith("mss")){
            System.out.println("Hello ma'am");
        }else if (name.startsWith("dr")){
            System.out.println("Hello doctor");
        }
        if (name.endsWith("sr")){
            System.out.println("nice to meet you senior");
        }else if (name.endsWith("jr")){
            System.out.println("Nice to meet you Junior");
        }
    }
}

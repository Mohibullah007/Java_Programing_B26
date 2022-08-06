package day18_string;

import java.util.Scanner;

/*
   Ask the user to enter a website
   check if it is a valid website

   - it is valid if it begins with:
       www.

   - it is valid if the end is:
       .com
       .edu
       .gov
       .net

    */
public class StartExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the URL");
        String url = input.next();
        url = url.toLowerCase();

        boolean validStart = url.startsWith("www.");
        boolean validEnd = url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith(".net");
        if (validStart && validEnd){
            System.out.println(url +" is a valid website");
        }
        if (!validStart){
            System.out.println("url needs to starts with www.");
        }
        if (!validEnd){
            System.out.println("url needs to end with .com or .edu or .net or .gov");
        }
    }
}

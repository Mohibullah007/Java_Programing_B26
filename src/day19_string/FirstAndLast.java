package day19_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine();

        System.out.println("First line: "+str.charAt(0));
        System.out.println("Last line: " + str.charAt(str.length() - 1));
    }
}

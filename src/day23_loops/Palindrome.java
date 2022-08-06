package day23_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
        means its the same reading from the beginning and end
        like:
        mom
        racecar
        anna
        madam
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a palindrome word");
        String s = input.nextLine();
        String str = "";

        for (int i = s.length()-1; i >= 0; i--) {
            str += s.charAt(i);

        }if (str.equals(s)){
            System.out.println("Correct, the word "+s+" is palindrome");
        }else {
            System.out.println("Incorrect, the word "+s+" is no a palindrome");
        }
        System.out.println("*********************************\nWithout Scanner");
        String a = "racecar";
        // reverse the String
        String reverse = "";
        for (int i = a.length() -1; i >= 0; i--) {
            reverse += a.charAt(i);
        }if (reverse.equals(a)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
        System.out.println("**********************************\n" + (str.equals(s) ? "Palindrome" : "Not palindrome"));
    }
}

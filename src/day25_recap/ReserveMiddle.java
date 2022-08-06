package day25_recap;

import java.util.Scanner;

/*
   Reverse only second word [String, Loops]

   Given a String with three words separated by spaces. Reverse only the second word and return the modified String
       Ex:
       I love java

       Ouput:
       I evol java
    */
public class ReserveMiddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 3 words");
        String str = input.nextLine().trim();

        int firstSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" ");

        String middleWord = str.substring(firstSpace +1, lastSpace);
        String reserve = "";

        for (int i = middleWord.length() -1; i >= 0; i--){
            reserve += middleWord.charAt(i);
        }
        System.out.println(str.substring(0, firstSpace + 1) + reserve + str.substring(lastSpace));
    }
}

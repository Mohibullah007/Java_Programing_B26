package day25_recap;

import java.util.Scanner;

/*
 Space program [String, Loops]

 Given a String return a version of with spaces between all of the letters.
 If there is already a space in the String put an underscore

     Ex: java    -> j a v a
         space     -> s p a c e
         more words -> m o r e _ w o r d s

  */
public class SpaceProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine().trim();
        String fixed = "";

        for (int i = 0; i < sentence.length(); i++){

            if (sentence.charAt(i) == ' '){
                fixed += "_ ";
            }else {
                fixed += sentence.charAt(i) + " ";
            }
        }
        System.out.println(fixed.trim());
    }
}

package day30_Arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        char[] letters = {'j', 'a', 'v', 'a'};

        String word = "java";
//TODO: converting a String to a char []
        char[] java = word.toCharArray();

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));

       // System.out.println(letters);  // TODO: String work with char [] internally so the char [] is able to be printed as the String

        // print every letter in my string

        for (char eachChar : java){
            System.out.println(eachChar);
        }
    }
}

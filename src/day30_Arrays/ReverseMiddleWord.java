package day30_Arrays;

import java.util.Arrays;

public class ReverseMiddleWord {
    public static void main(String[] args) {

        String a = "java always fun";
        String[] sentence = a.split(" ");
        String reverse = "";

        char [] middleWord = sentence[1].toCharArray();

        for (int i = middleWord.length - 1; i >= 0; i--) {
            reverse += middleWord[i];
        }
        System.out.println(sentence[0] + " " + reverse + " " + sentence[2]);
    }
}
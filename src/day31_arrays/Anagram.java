package day31_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String letter = "listen";
        String letter2 = "silent";

        char[] str = letter.toCharArray();
        char[] str2 = letter2.toCharArray();

        Arrays.sort(str);
        Arrays.sort(str2);

        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(str2));
        if (Arrays.equals(str, str2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
        System.out.println(Arrays.equals(str, str2) ? "Anagram" : "Not Anagram");
    }
}

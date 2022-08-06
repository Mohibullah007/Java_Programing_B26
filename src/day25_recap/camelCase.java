package day25_recap;

import java.util.Scanner;

/*
    Camel Case

    Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

    Ex:

        Today is SUNDAY

        Output:

        todayIsSunday
 */
public class camelCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String str = input.nextLine().toLowerCase();
        String camelCase2 = str.substring(0, 1);

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i - 1) == ' ') {
                camelCase2 += str.substring(i, i + 1).toUpperCase();
            }else {
                camelCase2 += str.substring(i);
            }
        }
        System.out.println(camelCase2.replace(" ", ""));
    }

}

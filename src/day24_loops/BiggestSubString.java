package day24_loops;

import javax.print.attribute.standard.PagesPerMinute;

public class BiggestSubString {
    public static void main(String[] args) {
        String a = "aaabbbcccccccdddddeeeee";
        String result = "";
        String biggest = "";

        for (int i =0; i < a.length() - 1; i++){
            result += a.charAt(i);

            if (a.charAt(i) != a.charAt(i + 1)){// when the character of i is different from the character-->
                //--> next to it (i + 1)
                if (result.length() > biggest.length()){
                    biggest = result;// assigns the substring as the new biggest
                }
                result = "";// resets this String for the next substring
            }

        }
        System.out.println(biggest);
    }
}

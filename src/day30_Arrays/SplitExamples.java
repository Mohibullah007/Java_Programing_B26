package day30_Arrays;

import java.util.Arrays;

public class SplitExamples {
    public static void main(String[] args) {
        String s = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        String[] days = s.split(",");
       // System.out.println(Arrays.toString(days));

        for (String str : days){
            System.out.println(str);
        }
        System.out.println("=====================");
        String [] byDay = s.split("day");

        for (String str2 : byDay){
            System.out.println(str2);
        }
        System.out.println("=====================");
        String m = "Jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";

        String [] months = m.split("-");

        for (String str3 : months){
            System.out.println(str3);
        }
    }
}

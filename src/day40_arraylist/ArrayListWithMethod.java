package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethod {
    public static ArrayList<String> getDaysOfWeek(){
        ArrayList<String> days = new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        ));
        return days;

    }
    public static void main(String[] args) {
        System.out.println(getDaysOfWeek());

        ArrayList<String> days = getDaysOfWeek();
        System.out.println(days.get(0));

        System.out.println(getDaysOfWeek().get(0));

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(printList(list));
    }
    public static String printList(ArrayList<String> list){
        String str = "LIST: ";

        for (String each : list){
            str += "\n~\t" + each;
        }
        return str;
    }
}

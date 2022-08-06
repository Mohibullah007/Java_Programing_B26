package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {

        ArrayList<Integer> base = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 12, 9, 143, 4, 5, 7, 8, 2));

        ArrayList<Integer> nums = new ArrayList<>(base);
        nums.removeIf(n -> n % 2 == 0);
        System.out.println(nums);

        ArrayList<Integer> num2 = new ArrayList<>(base);
        num2.removeIf(each -> each > 10);
        System.out.println(num2);

        ArrayList<String> days = ArrayListWithMethod.getDaysOfWeek();
        days.removeIf(day -> day.startsWith("S") || day.startsWith("T"));
        System.out.println(days);
    }
}

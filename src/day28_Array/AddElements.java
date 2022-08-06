package day28_Array;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int []  num = {3, 6, 10};
        System.out.println("Hardcoded sum: " + (num[0] + num[1] + num[2]));

        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);
    }
}

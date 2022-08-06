package day32_arrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {

        int [] n = {5, 10, 20, 10};
        int [] m = {5, 10, 100,39,19};

        int [][] all = {n, m};
        System.out.println(Arrays.toString(all)); // TODO: it will gives you tow locations not the values
        System.out.println(Arrays.deepToString(all)); // TODO: this method allows you to enter your multidomin array

        System.out.println("First array: " + Arrays.toString(all[0]));
        System.out.println("Second array: " + Arrays.toString(all[1]));

        System.out.println("============================================");

        int [][] multi = {
                {90, 80, 70},
                {19, 51, 1129, 12},
                {10, 1900},
                {14},
        };

        System.out.println(multi.length);
        System.out.println(multi[0].length);
        System.out.println(multi[0][1]);
        System.out.println(multi[3].length);
        //System.out.println(multi[3][1]); TODO: it will go out of bounds coz we don't have any variable

    }
}

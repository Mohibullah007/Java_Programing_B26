package day28_Array;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {


        int[] num = {100, 120, -82, 90, 250, -10};
        int max = 0;
        int min = 0;
        for (int i = 0; i < num.length ; i++) {
            int number = num[i];
            if (number > max){ // if (num[i] > max)
              max =  number; // max = num[i]
            }
           if (number < min){
               min = number;
           }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
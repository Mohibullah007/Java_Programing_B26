package day10_02_16_22;

import java.util.Arrays;

public class P01_RotatedLeft {
    public static void main(String[] args) {
        int [] x = {1, 2, 3, 4, 5};   // => [2,3,4,5,1]

        /*
        i=0  --> x[0] = x[1]  --> 2,2,3,4,5
        i=1  --> x[1] = x[2]  --> 2,2,3,4,5
        i=2  --> x[2] = x[3]  --> 2,2,3,4,5
        i=3  --> x[3] = x[4]  --> 2,2,3,4,5

        formula:
                x[i] = x[i+1]
         */
        int temp = x[0];

        for (int i = 0; i < x.length -1; i++) {
            x[i] = x[i+1];
        }
        x[x.length -1] = temp;
        System.out.println(Arrays.toString(x));
    }
}

package day32_arrays;

import java.util.Arrays;

public class AverageOfEach {
    /*

 Given a 2D array find the average of each inner array
 and extra: average of the whole array

 Ex:

     3, 4, 5, 6
     5, 2, 6
     10, 20, 30

  */
    public static void main(String[] args) {
        int [][] a = new int[3][];

        int[] first = {3, 4, 5, 6};
        a[0] = first;
        int[] second = {5, 2, 6};
        a[1] = second;
        int[] third = {10, 20, 30};
        a[2] = third;

        double totalAverage = 0;
        int totalLength = 0;
        for (int[] arr : a){

            double average = 0;
            for (int eachArr : arr){
                average += eachArr;
            }
            System.out.println(Arrays.toString(arr) + " the average is: " + (average/ arr.length));
            totalAverage += average;
            totalAverage += arr.length;
        }
        System.out.println("Average of the whole 2D array: " + (totalAverage/ totalLength));
    }
}

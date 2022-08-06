package day32_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
      /*

    Have a starting array
    you want to add a number to the end
    so make your array bigger to store the new number

     */
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("How many number to start with");
          int  size = input.nextInt();
          int[] num = new int[size];

          for (int i = 0; i < size; i++) {
              System.out.println("Enter a number");
              num[i] = input.nextInt();

          }
          System.out.println("Array so far: " + Arrays.toString(num));
          int [] expended = Arrays.copyOf(num, num.length + 1);

          System.out.println("Enter the last number");
          expended[expended.length-1] = input.nextInt();
          System.out.println(Arrays.toString(expended));

      }
}

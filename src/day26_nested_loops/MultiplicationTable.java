package day26_nested_loops;

public class MultiplicationTable {
  /*

        print the multiplication by the numbers from 1 to 10
        we will see for all numbers 1 - 10

        1 x 1 = 1
        1 x 2 = 2
        ...
        2 x 1
        2 x 2
        ..
        3 x 1
        ..

        10 x 10


     */
  public static void main(String[] args) {
/*
separate hard coded loops
      for (int number1 = 1; number1 <= 10; number1++) {
          System.out.println("1 X " + number1 + " = " + (1 * number1));
*/
      for (int i = 1; i <= 10; i++) {
          for (int multi = 1; multi <= 10; multi++) {
              System.out.print( i +" x "+multi + " = "+ (i * multi) + " | ");
          }
          System.out.println();
      }
      }

  }


package day28_Array;
import java.util.Arrays;
import java.util.Scanner;

public class SelectMonth {
    /*

     Ask the user the month number they want, print the month name

     1 --> January

     12 --> December

     Assume only valid numbers are given, but as a challenge you can handle invalid numbers

  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which month number do you want");
        int  num = input.nextInt();
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

        System.out.println(months[num - 1]); // TODO: we minus one because java is reading the whole numbers which is starting from zero.
    }
}
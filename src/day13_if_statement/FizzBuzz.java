package day13_if_statement;
import java.util.Scanner;
public class FizzBuzz {
    /*
    you have a number
    if the number is divisible by 3 print -> Fizz

     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
    int num = input.nextInt();
        if (num % 3 ==0 && num % 5==0){
            System.out.println("FizzBuzz");
        }else if (num % 3 ==0){
        System.out.println("Fizz"); // here the system just read from up to down and when it find one true it does not gonna check others.
    }else if (num % 5 == 0){
        System.out.println("Buzz"); // you have to change your condation places or use single if statement coz it reads all the system.

    }else {
        System.out.println(num); }

    }
}

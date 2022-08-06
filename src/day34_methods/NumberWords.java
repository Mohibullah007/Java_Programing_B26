package day34_methods;

import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {
        numberAsWord(3);
        System.out.println(numberAsWord(3));
        System.out.println(numberAsWord(10));
        System.out.println("-------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number form 1 to 10");
        System.out.println(numberAsWord(input.nextInt()));

        /*
        why can't I do this:
        int num = numberAsWord(input.next());

       the method returns String, so we must store into a String variable
       String num = numberAsWord(input.next();
         */
    }

    public static String numberAsWord(int num){
        if (num < 1 || num > 10){
            return num + " is an invalid number";
//TODO:  when if statement gets true, return will runs and after running return it will automatically stop the program.
        }

        String [] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        return words[num - 1];
    }


}

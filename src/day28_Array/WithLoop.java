package day28_Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class WithLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] student4 = new String[4];

        String [] questions = {"Enter your id", "Enter your first name", "Enter your last name", "What is your batch number"};
        for (int i = 0; i < 4; i++) {
            System.out.println(questions[i]);
            student4[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(student4));
    }
}
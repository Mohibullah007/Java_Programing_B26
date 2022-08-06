package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        /*
        0 - full name
        1- account type
        2 - account number
        3 - balance

         */
        String [] bankAccountOne = {"Brad Smith" , "Checking" , "102485766" , "253,000,000"};
        System.out.println(Arrays.toString(bankAccountOne));

        System.out.println("Name: " + bankAccountOne[0]);
        System.out.println("Account Type: " + bankAccountOne[1]);
        System.out.println("Account Number: " + bankAccountOne[2]);
        System.out.println("Balance: " + bankAccountOne[3]);

        System.out.println("=======================================");
        String [] bankAccount2 = new String[4];
        System.out.println(Arrays.toString(bankAccount2));
        bankAccount2 [0] = "Jamie Fox";
        bankAccount2 [1] = "Savings";
        bankAccount2 [2] = "1325896412";
        bankAccount2 [3] = "664,524,856";
        System.out.println(Arrays.toString(bankAccount2));

        System.out.println("======================================");
        String [] bankAccount3 = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name:");
        bankAccount3[0] = input.nextLine();
        System.out.println("Enter your account type:");
        bankAccount3[1] = input.nextLine();
        System.out.println("Enter your account number:");
        bankAccount3[2] = input.nextLine();
        System.out.println("Enter your balance:");
        bankAccount3[3] = input.nextLine();
        System.out.println("==========================================");
        String [] bankAccount4 = new String[4];
        String [] questions = {"full name", "account type", "account number", "balance"};

        for (int i = 0; i < bankAccount4.length; i++) {
            System.out.println("Enter your "+ i);
            bankAccount4[i] = input.nextLine();

        }
        System.out.println(Arrays.toString(bankAccount4));

    }
}

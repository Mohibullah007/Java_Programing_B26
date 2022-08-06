package day14_nested_ifstatement;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t*** Welcome to ATM*** \nPlease Enter your card and then type pincode");
        int pincode = input.nextInt();

        int expectedPin = 2387;

        if (pincode == expectedPin){

            System.out.println("Logged in");
            System.out.println("Select a number");
            System.out.println("\t1) Check Balance");
            System.out.println("\t2) Withdraw");
            System.out.println("\t3) Deposit");
            int option = input.nextInt();

            if(option ==1){
                System.out.println("Your balance is: $" +120300);
            }else if(option ==2){
                System.out.println("Enter withdrawal amount");
                int money = input.nextInt();
                System.out.println("You have withdrawal $"+money+" successfully");
            }else if (option == 3){
                System.out.println("Enter deposit amount");
                int diposit = input.nextInt();
                System.out.println("You have deposit $"+diposit+" successfully");
            }

        }else {
            System.out.println("Invalid pin. Please try again");
        }
    }
}

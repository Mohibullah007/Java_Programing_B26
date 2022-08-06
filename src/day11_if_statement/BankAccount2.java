package day11_if_statement;
import java.util.Scanner;
public class BankAccount2 {
    /*
    Task: Hard code -> Dynamic

 Create a double value for the account balance.
 Create a double value for how much you want to withdraw

 Check the balance after the withdraw
     if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance

 In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over
  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance ");
        double balance = input.nextDouble();
        System.out.println("How much are you withdrawing");
        double withdraw = input.nextInt();
        balance -= withdraw;


        if (balance < 0){
            System.out.println("Thank you for being our customer \nTook out too much money" );
            System.out.println("Balance before Penalty " + (balance));
            balance *=100; // balance = balance - 100; (its about bank panelty)
            System.out.println("Bank Penalty 10 %" );
        }

        System.out.println("Balance $" + balance);
    }
}




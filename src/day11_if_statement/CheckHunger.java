package day11_if_statement;
/*
        if (isHungry) {

                System.out.println("You are hungry so I will get some food for you");
                } else {
                System.out.println("Great, then practice java");
                }

 */
import java.util.Scanner;
public class CheckHunger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you hungry ?\ntrue or false");
        boolean ishungry = input.nextBoolean();

       //  boolean ishungry = true;
        if ( ishungry) {
            System.out.println("you are hungry so I will get some food for you");
        } else {
            System.out.println("Great then practice java");
        }
    }
}

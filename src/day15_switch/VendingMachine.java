package day15_switch;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to vending machine. Please select one of the following:\n\tDrinks\n\tSnacks\n\tGum");
        String selection = input.next();
        String item = "";

        switch (selection){
            case "Drinks":
                System.out.println("you chose drinks: press a number:\n\t1) Water \n\t2) Soda\n\t3) juice");
                int drinksNumber = input.nextInt();
                if (drinksNumber == 1){
                    item = "water";
                }else if (drinksNumber == 2){
                    item = "soda";
                }else if (drinksNumber == 3){
                    item = "juice";
                }
                break;
            case "Snacks":
                System.out.println("you chose snacks: press a number: \n\t1) Chips\n\t2) Cookies");
                int snacksNumber = input.nextInt();
                if (snacksNumber == 1){
                    item = "chips";
                }else if (snacksNumber == 2){
                    item = "cookies";
                }
                break;
            case "Gum":
                System.out.println("you chose Gum: press a number:\n\t 1) blueberry gum\n\t2) strawberry gum\n\t3) bubble gum");
                int gumNumber = input.nextInt();
                if (gumNumber == 1){
                    item = "blueberry gum";
                }else if (gumNumber == 2){
                    item = "strawberry gum";
                }else if (gumNumber == 3){
                    item = "bubble gum";
                }
        }
        System.out.println("Vending.... "+item);
    }
}

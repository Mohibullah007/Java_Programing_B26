package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        repeated steps:
        ask the user to enter the item
        add item to shopping list
        ask the user if they want to add more item

        at the end show the full shopping list
         */
        String list = "Shopping List:";
        String addMore;

        do {
            System.out.println("Enter the name of the item:");
            list += "\n* " + input.nextLine();

            System.out.println("Do you want to add more to your shopping list?");
            addMore = input.nextLine();

        }while (addMore.equalsIgnoreCase("yes") || addMore.equalsIgnoreCase("yup") || addMore.equalsIgnoreCase("ok") ||
                addMore.equalsIgnoreCase("y"));
        System.out.println(list);
    }
}

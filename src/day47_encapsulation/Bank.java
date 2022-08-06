package day47_encapsulation;

import day09_Scanners.Discount;
import day15_switch.DaysInWeek;

public class Bank {
    public static void main(String[] args) {

        System.out.println(DebitCard.accountType);

        DebitCard obj1 = new DebitCard(1017598323546988l, "James", 10000000);
        System.out.println(obj1);

        System.out.println();

        DebitCard obj2 = new DebitCard(7863549128765l, "Ben", 145000);
        System.out.println(obj2);
    }
}

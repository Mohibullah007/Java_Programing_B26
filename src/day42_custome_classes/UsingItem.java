package day42_custome_classes;

import java.awt.geom.Line2D;

public class UsingItem {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.name = "Apples";
        item1.price = 3.99;

        System.out.println(item1);


        Item item2 = new Item();
        item2.name = "Peers";
        item2.price = 2.99;
        System.out.println(item2);
    }
}

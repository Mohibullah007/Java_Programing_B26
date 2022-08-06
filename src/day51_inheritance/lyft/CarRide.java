package day51_inheritance.lyft;

import day50_inheritance.book.Library;

public class CarRide {
    public static void main(String[] args) {

        Lyft obj1 = new Lyft("James");
        System.out.println(obj1.driver);
        System.out.println(obj1.calculateRate(10));
        System.out.println(obj1.calculateRate(50));
    }
}

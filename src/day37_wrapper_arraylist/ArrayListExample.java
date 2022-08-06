package day37_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        numbers.add(100);
        System.out.println(numbers);

        numbers.add(-100);
        System.out.println(numbers);

        numbers.add(50);
        numbers.add(23);
        System.out.println(numbers);


        // TODO: how do we access each element: arr[index]
        System.out.println("--------------------\nGetting each index\n--------------------");

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));

        //System.out.println(numbers.get(30)); TODO: out of bonds
    }
}

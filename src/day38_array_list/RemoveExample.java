package day38_array_list;

import java.util.ArrayList;

public class RemoveExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("water");
        list.add("sun");
        list.add("wind");
        list.add("wood");
        System.out.println(list); //[water, sun, wind, wood]

        list.remove(0); // TODO: it will remove first element
        System.out.println(list); //[sun, wind, wood]

        System.out.println(list.remove(list.size() -1)); // TODO: it will remove the last index and then print it

        System.out.println(list); //[sun, wind] TODO: it will remove your all removed ordered and then print the remaining

        list.remove("sun");
        System.out.println(list);

        System.out.println(list.remove("apple")); // return false because I don't have an element of apple
        System.out.println(list);

        list.add("light");
        list.add("choclat");
        list.add("light");
        System.out.println(list);

        list.remove("light"); // TODO: it will remove the first light element by default
        System.out.println(list);

        System.out.println(list.remove("choclat")); // it will give you true
        System.out.println(list);
    }
}

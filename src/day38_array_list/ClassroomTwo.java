package day38_array_list;

import java.util.ArrayList;

public class ClassroomTwo {
    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        group.add("Ziba");
        System.out.println(group);
//TODO: OVERLOADING
        group.add(0, "Victor");
        System.out.println(group); // [Victor, Ziba]

        System.out.println(group.get(0)); // Victor
        System.out.println(group.get(1)); // Ziba

        group.add("Ozi"); // [Victor, Ziba, Ozi]
        System.out.println(group);

        group.add(1, "James"); // [Victor, James, Ziba, Ozi]
        System.out.println(group);

        System.out.println(group.add("Emri")); // TODO: will gives you a boolean type (True)
        System.out.println(group);


    }
}

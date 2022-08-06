package day60_collections;

import java.util.*;

public class SetVsList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
        System.out.println(list);
        System.out.println("First: " + list.get(0));
        System.out.println("Last: " + list.get(list.size()-1));

        System.out.println("--------------------------------------");

        Set<Integer> set = new HashSet<>();
        set.add(4); // todo: does not accept duplicate variables
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10);
        set.add(4);
        System.out.println(set);
//      System.out.println("First: " + set.get(0));
//      System.out.println("Last: " + set.get(set.size()-1));
        // TODO: set does not have indexes

        System.out.println("--------------------------------------");

            for (int each : set){
            System.out.println(each);
        }

        System.out.println("--------------------------------------\nsort HashSet");

            // sort HashSet
        System.out.println(new TreeSet<>(set));

        System.out.println("--------------------------------------\nconverting list to set");

        // converting list to set
        System.out.println(new LinkedHashSet<>(list));

        System.out.println("--------------------------------------\nconverting ArrayList to set");

        System.out.println(new HashSet<>(Arrays.asList(1, 5, 2, 1, 4, 2, 5, 1))); // aslist method return List type,
        // which can have the reference of the collection interface,
        // so we are able ro make an object of HashSet with these initial values

        System.out.println("--------------------------------------\nRemoving duplicate character in string");

        String s = "aaaabbbbbccccdddddd";
        System.out.println(new HashSet<>(Arrays.asList(s.split("")))
                .toString()
                .replace(", ", "")
                .replace("[", "")
                .replace("]", ""));
    }
}

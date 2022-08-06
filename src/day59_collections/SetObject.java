package day59_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObject {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add(null);
        set.add("hello");
        set.add("$4.5");
        set.add("400");
        set.add("hello"); //TODO: it will not run duplicate
        set.add("%");
        System.out.println(set); //TODO: it is random - no sorted - does not maintain the order
        System.out.println("-----------------------------------------");


        Set<String> set2 = new LinkedHashSet<>();
        set2.add(null);
        set2.add("hello");
        set2.add("$4.5");
        set2.add("400");
        set2.add("hello"); //TODO: it will not run duplicate
        set2.add("%");
        set2.add("400"); //TODO: it will not run duplicate
        System.out.println(set2); //TODO: it will maintain the order

        Set<String> set3 = new TreeSet<>();
      //  set3.add(null); TODO: null not allowed in treeSet
        set3.add("hello");
        set3.add("$4.5");
        set3.add("400");
        set3.add("hello"); //TODO: it will not run duplicate
        set3.add("%");
        set3.add("400"); //TODO: it will not run duplicate
        set3.add("Hello");
        System.out.println(set3); //TODO: it will sort the data by it types

    }
}

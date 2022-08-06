package day61_maps;

import java.util.*;

public class AllMapObjects {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("class", "java");
        map.put("hello", "world");
        map.put("james", "bond");
        map.put("soft skills", "Nadir");
        map.put("username", "password");
        map.put(null, "noting");
        System.out.println(map);

        System.out.println("-----------------------------------------------------------------------------------------");

        Map<String, String> linked = new LinkedHashMap<>();
        linked.put("class", "java");
        linked.put("hello", "world");
        linked.put("james", "bond");
        linked.put("soft skills", "Nadir");
        linked.put("username", "password");
        linked.put(null, "noting");
        System.out.println(linked);
        // todo: it will maintain the insertion order

        System.out.println("-----------------------------------------------------------------------------------------");

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("class", "java");
        treeMap.put("hello", "world");
        treeMap.put("james", "bond");
        treeMap.put("soft skills", "Nadir");
        treeMap.put("username", "password");
        treeMap.put("name", null);
       // treeMap.put(null, "noting"); todo: treeMap doesn't accept "null" key
        System.out.println(treeMap);

        System.out.println("-----------------------------------------------------------------------------------------");

        Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("class", "java");
        hashtable.put("hello", "world");
        hashtable.put("james", "bond");
        hashtable.put("soft skills", "Nadir");
        hashtable.put("username", "password");
       // treeMap.put("name", null); todo: hashtable doesn't accept "null" value
        // treeMap.put(null, "noting"); todo: hashtable doesn't accept "null" key
        System.out.println(hashtable);
    }
}

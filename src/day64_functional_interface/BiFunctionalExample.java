package day64_functional_interface;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionalExample {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> maxNumber = (one, two) -> {
            return one > two ? one : two;
        };

        System.out.println("maxNumber.apply(5, 12) = " + maxNumber.apply(5, 12));

        System.out.println("-------------------------------------------------------------------");
        BiFunction<List<Integer>, List<String>, Map<Integer, String>> createMap = (keys, values) -> {

            Map<Integer, String> map = new HashMap<>();

            for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get(i), values.get(i));
            }
            return map;
        };
        List<Integer> keys = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<String> values = new ArrayList<>(Arrays.asList("James", "Anna", "Emre", "Gina"));

        System.out.println("createMap.apply(keys, values) = " + createMap.apply(keys, values));

    }
}

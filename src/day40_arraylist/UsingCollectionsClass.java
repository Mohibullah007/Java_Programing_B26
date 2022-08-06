package day40_arraylist;

import sun.security.util.UntrustedCertificates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, 6, 2, 67, 22, 230, 12));
        Collections.sort(list); // TODO: COLLECTION IS A CLASS THAT CONTAINS METHODS with the arrayList
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));
        //letters.reverse() TODO: there is no reverse and sort method in arrayList, for these order we have to use ->
        // todo: ->Collections.reverse/sort(ArrayList name)
        Collections.reverse(letters);
        System.out.println(letters);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        Collections.swap(letters, 0, 3); // TODO: it replaces to characters potion
        System.out.println(letters);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, 11, 20, 11, 20, 30));
        System.out.println(Collections.frequency(numbers, 11));
        // TODO: it shows how many times the character is repeated ArrayList

        ArrayList<String> words = new ArrayList<>(Arrays.asList("one", "two", "three", "one", "one", "four", "one"));
        System.out.println(Collections.frequency(words, "one"));
    }
}

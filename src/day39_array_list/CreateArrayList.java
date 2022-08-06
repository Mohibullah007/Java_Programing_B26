package day39_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Hello");
        listOne.add("bye");
        System.out.println(listOne);

        ArrayList<String> listTwo = new ArrayList<>( listOne ); // adding the elements from the listOne ArrayList into listTwo
        listTwo.add("Hola");
        System.out.println(listOne);
        System.out.println(listTwo);

        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(listThree);

        //ArrayList<String> listFour = new ArrayList<>("four", "five", "six"); TODO: it will not gonna work we have to assign the value in Arrays.toList
    }
}

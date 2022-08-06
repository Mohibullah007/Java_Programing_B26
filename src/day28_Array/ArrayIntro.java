package day28_Array;

import java.util.Arrays;

public class ArrayIntro {
   // private static Object Arrays; TODO: noting to do with yet

    public static void main(String[] args) {
        // with normal variables

        String cityOne = "kabul";
        String cityTwo = "Feredricksburg";
        String cityTree = "Chicago";
        String cityFour = "Berlin";
        String cityFive = "Denver";

        // declare array with values
        String [] cities = {"Kabul" , "Feredricksburg" , "Chicago" , "Berlin" , "Denver"};
        //String [] cities2 = {cityOne, cityTwo, cityTree, cityFour, cityFive}; TODO: we also can call our variables.
        //System.out.println(cities); TODO: it is not gonna give us result.

        // how to access each element in the array
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println("==================================================================================");
        // print all the cities in one line

        System.out.println("Reverse order of the cities: " + cities[4] + ", "  + cities[3] + ", " + cities[2] + ", " +
                cities[1] + ", " + cities[0]);
        System.out.println("====================================================================================");
        // print the array all at one time
        System.out.println(Arrays.toString(cities));
        System.out.println("====================================================================================");

        // number of elements
        System.out.println(Arrays.toString(cities).length());
    }
}

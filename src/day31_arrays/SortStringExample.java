package day31_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {
        String [] arr = {"java", "Hello", "$Dollar", "Zell", "4four", "five5", "Zebra", "SIX", "six"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

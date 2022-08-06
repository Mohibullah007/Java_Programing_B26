package day32_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int [] nums = {4, 10, 30, 100};

        System.out.println(Arrays.binarySearch(nums, 4));
        System.out.println(Arrays.binarySearch(nums, 100));
        System.out.println(Arrays.binarySearch(nums, 200)); // TODO: if the element you are looking for -->
        //TODO --> is not in the array, then it returns a negative number based on where the position would be + 1
        System.out.println(Arrays.binarySearch(nums, 6));
    }
}

package day31_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        int [] a = {1, 2, 3};
        int [] b = {1,2,3};
        int [] c = a;

        System.out.println(a == b);
        System.out.println(Arrays.equals(a, b)); // TODO: It returns you boolean
        System.out.println(a == c);//TODO: compares the array with c arrays, they are both reference to the same array object
        //System.out.println(a.equals(b)); TODO: this method is not Arrays method, its String method

        boolean same = Arrays.equals(a,b);

        int [] d = {3, 2, 1};
        System.out.println(Arrays.equals(a, d));
        Arrays.sort(d);
        System.out.println(Arrays.equals(a, d));
    }
}

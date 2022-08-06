package day48_encapsulation.normal;

import my_utilities.StringUtil;

import java.util.Arrays;

public class Normal {
    public static void main(String[] args) {

        int [] a = { 4, 12, 5, 25 };

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        System.out.println(Math.PI); // this is variable static

        System.out.println(StringUtil.reverse("java"));
    }
}

package day48_encapsulation.normal;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import static java.util.Arrays.*;
// TODO: (*) mean all the members. THIS LINE IMPORTS ALL THE STATIC MEMBERS FROM THE ARRAYS CLASS

import static java.lang.Math.*;

import static my_utilities.StringUtil.reverse;


public class WithImport {
    public static void main(String[] args) {

        int [] a = { 4, 12, 5, 25 };

        sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(PI);

        System.out.println(abs(-1));

        System.out.println(reverse("apple"));
    }
}

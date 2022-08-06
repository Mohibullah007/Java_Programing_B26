package day08_relational_operators;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class OperationalPractice3 {
    public static void main(String[] args) {


        int h = 5;
        int p = h;
        h++;
        System.out.println("H "+h);
        System.out.println("P "+p);

        int k = h++;
        System.out.println("K "+k);
        System.out.println("H "+h);

        int g = ++h;
        System.out.println("H "+h);
        System.out.println("G "+g);

    }
}
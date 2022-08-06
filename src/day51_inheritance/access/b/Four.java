package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Four extends First{
    public static void main(String[] args) {

        // different class, different package with inheritance

        First obj = new First();
        System.out.println(obj.one);
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);

        Four obj2 = new Four();
        System.out.println(obj2.one);
        System.out.println(obj2.two);
    }
}

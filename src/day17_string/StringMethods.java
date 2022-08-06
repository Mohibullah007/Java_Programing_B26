package day17_string;

import java.util.jar.JarOutputStream;

public class StringMethods {
    public static void main(String[] args) {
        String name = "james";

        // how to compare String values --> use .equals()
        System.out.println(name.equals("james"));

        System.out.println(name.equals("john"));

        // todo: .equals() compare the value, meaning the character

        String a = new String ("hello");
        String b = new String("hello");
        System.out.println(a.equals(b)); // todo: .equal() is to compare the action of character

        System.out.println(a.equals("hello")); // todo: we compare String value here not the location of the data
        System.out.println("***************************************");

        String one = "jan";
        System.out.println(one.equalsIgnoreCase("JAN")); // todo: equalsIgnoreCase() is don't care about -->
        //todo --> lower or upper case it will give you true when the typing is correct

        System.out.println("***************************");

        System.out.println(one.length()); // todo: .length() is count our String characters into int number
        System.out.println("********************");

    }
}

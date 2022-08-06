package day37_wrapper_arraylist;

public class ValueVSParse {
    public static void main(String[] args) {

        String s = "30";

        int seconds = Integer.parseInt(s);
        // TODO: convert the "30" String into an int of 30

        Integer i = Integer.valueOf(s);
        // TODO: convert the "30" String into the Integer wrapper class object

        int i2 = Integer.valueOf(s); /* TODO: ---> it convert the 30 String into the Integer Object
    int i2 = --> im trying to store the value into a primitive variable

    primitive = object type [ unboxing ]
    */
        String s2 = String.valueOf(30);
        System.out.println(s2 + 5);
        // TODO: PARSE RETURN YOU PRIMITIVE TYPE -----AND------ VALUE RETURN YOU OBJECT TYPE
    }
}
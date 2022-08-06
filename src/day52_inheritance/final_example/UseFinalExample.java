package day52_inheritance.final_example;
//public class UseFinalExample extends FinalExample
// this is not valid because FinalExample is final class

public class UseFinalExample {
    public static void main(String[] args) {

        System.out.println(FinalExample.PLANET);
        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.b);

        // obj.a = 4; we can not change the value of final object
        // obj.b = 40;

        System.out.println();
        FinalExample obj2 = new FinalExample(100);
        System.out.println(obj2.a);
        System.out.println(obj2.b);
    }
}

package day63_fuctional_interface;

public class UsingDynamicInterface {

    public static void main(String[] args) {

        DynamicInterface<String> printEachChar = (str) -> {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        };

        printEachChar.test("hello world");

//        DynamicInterface<Integer> printEachNumber = () -> {};
    }
}

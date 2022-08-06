package day18_string;

public class StartAndEnd {
    public static void main(String[] args) {
        String str = "Apple";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));

        System.out.println(str.startsWith("Apple"));

        String s = "A";
        System.out.println(str.startsWith(s)); // does the string str start with the string s.

    }
}

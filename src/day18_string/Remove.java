package day18_string;

public class Remove {
    public static void main(String[] args) {
        String s = "     saturday     ";
        System.out.println(s);
        System.out.println(s.length());

        s = s.trim();

        System.out.println(s);
        System.out.println(s.length());

        String str = "    java is fun    ";
        System.out.println(str.startsWith("java"));
       // System.out.println(str.trim());
        str = str.trim();    // todo: .trim() remove the spaces before and after the ...
        System.out.println(str.startsWith("java"));
    }
}

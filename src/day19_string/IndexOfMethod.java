package day19_string;

public class IndexOfMethod {
    public static void main(String[] args) {
        String s = "pen";

        System.out.println(s.indexOf("p"));
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("n"));

        System.out.println(s.indexOf("pe")); // todo: it will read your first input character
        System.out.println(s.indexOf("en")); // todo: it will give you 1 because e is one by default
        System.out.println(s.indexOf("x")); // todo: if you don't have the character exist it always get -1
        System.out.println(s.indexOf("pn")); // todo: characters have to be 0,1,2,3,4 not 0,3 or 0,2 it gives you -1


    }
}

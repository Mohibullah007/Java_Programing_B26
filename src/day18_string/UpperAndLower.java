package day18_string;


public class UpperAndLower {
    public static void main(String[] args) {
        String str = "sNOw";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str);
        System.out.println("*******************************");

        String word = "HELLO";
        word = word.toLowerCase();
        System.out.println(word);
        System.out.println("********************************");

        int a = 4;
        a++; // todo: when we assign just one int with post plus your value will change
        System.out.println(a);
        System.out.println("*********************************");

        String word2  = word + "WORLD";
        System.out.println(word2);
        System.out.println(word);

        word += "  new text"; // word = word + "next text"


        System.out.println(word);

        String old = "mark";
        String newValue = old.toUpperCase();
        System.out.println(old);
        System.out.println(newValue);

    }
}

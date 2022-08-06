package day23_loops;

public class PrintEachChar {
    public static void main(String[] args) {

        String s = "java";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        System.out.println("With loops");

        for (int i = 0; i < s.length(); i++) { // we also can assign i <= s.length() -1
            // i < s.length()   --> i < 4 == 3
            //i <= s.length() -1 --> i < 4 - 1 == 3
            // todo: both is same
            System.out.println(s.charAt(i));

        }

    }
}
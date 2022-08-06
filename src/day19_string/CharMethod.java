package day19_string;

public class CharMethod {
    public static void main(String[] args) {


        String s = "java";
        //          0123
        System.out.println(s.length());

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        //System.out.println(s.charAt(4));  todo: 4 is not in my String therefore it gives as error

        int lastIndex = s.length() - 1;  // 4 - 1 = 3 todo: it returns you the last index
        System.out.println("last char: "+s.charAt(lastIndex)); //todo: this is the same as line 14, but line 14 is hardcoded

        int lastIndeX = s.length() - 2;
        System.out.println("last char: "+s.charAt(lastIndeX));
    }
}

package day19_string;

public class MergeString {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = "xyz";

        System.out.println(""+str.charAt(0) + str2.charAt(0)+ str.charAt(1)+str2.charAt(1)+str.charAt(2)+ str2.charAt(2));
        System.out.println("***************************");

        String a = "abc";
        String b = "xyz";

        String merged = "";
        merged += a.charAt(0);
        merged += b.charAt(0);
        merged += a.charAt(1);
        merged += b.charAt(1);
        merged += a.charAt(2);
        merged += b.charAt(2);
        System.out.println(merged);
    }
}

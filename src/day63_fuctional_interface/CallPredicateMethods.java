package day63_fuctional_interface;

public class CallPredicateMethods {
    public static void main(String[] args) {

        boolean b = UsePredicate.isPalindrome.test("racecar");
        System.out.println(b);

        System.out.println(UsePredicate.isPalindrome.test("abc"));

        System.out.println("----------------");

        System.out.println(UsePredicate.isPrime.test(5));

        System.out.println(UsePredicate.isPrime.test(10));
    }
}

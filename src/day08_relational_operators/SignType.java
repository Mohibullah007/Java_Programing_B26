package day08_relational_operators;

public class SignType {
    public static void main(String[] args) {
        int number = -34;

        System.out.println("5+2="+3+4);
        System.out.println("5+2="+(3+4));

        boolean isItPositive = number >0;
        boolean isItNegative = number <0;
        boolean isItZero = number == 0;

        System.out.println(number+" Is Positive: "+isItPositive);
        System.out.println(number+" Is Negative: "+isItNegative);
        System.out.println(number+" Is Zero: "+isItZero);
    }
}

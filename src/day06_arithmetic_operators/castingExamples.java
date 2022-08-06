package day06_arithmetic_operators;

public class castingExamples {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        // todo: using data types smaller (byte, short) than int in a calculation the result will automatic change into int.
        //(byte sum = b1 + b2),
        int sum = b1 + b2;
        //todo: if we want to change it into byte we have to casting it after the sum.
        byte sum1 = (byte)sum;

        System.out.println(sum1);
    }
}

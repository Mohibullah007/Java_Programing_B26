package day07_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {
        int x = 0;
        x = x + 1;

        System.out.println(x);

        x++; //post increment will print x + 1
        System.out.println(x);

        ++x; // pre-increment will print 1 + x, x price was 1 + 2 = 3
        System.out.println(x);

        System.out.println(++x); //in this line noting gonna change
        // it is pre-increment it will add 1 right away so 4 is printing.

        System.out.println(x++); // in this line noting gonna change
        // it is post-increment it will add 1 right away so 5 is printing on the next line.
        System.out.println(x);






    }

}

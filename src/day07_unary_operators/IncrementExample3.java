package day07_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {
        int i = 5; // i will give 6 because we add 1 for i 
        int z = i++; // z will give 5 because it is post_increment.


        System.out.println(i); //
        System.out.println(z); //

        /*
        int i = 5; // i = 5

        int z = i++; // here: z = 5 (before incrementing the i),  but i = 6 now (after being incremented)

        System.out.println(i); // i now = 6
        System.out.println(z); // z still = 5 because it equals i before being incremented.
         */
    }




}

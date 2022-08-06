package day21_loops;

import javax.crypto.spec.PSource;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.function.ToDoubleBiFunction;

public class PrintNumbers {
    public static void main(String[] args) {
// todo: for even numbers
        int num = 2;

        while (num <= 100){
            System.out.print(num);
            num += 2;
        }
        System.out.println("\n**************************************************************************************************************************************");
        // TODO: approach 2
        int i = 1;
        while (i <= 100){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
            i++; }
        System.out.println("\n***************************************************************************************************************************************");
        // TODO: for odd numbers

        int a = 1;
        while (a <= 100){
            System.out.print(a + " ");
            a += 2;
        }
        System.out.println("\n****************************************************************************************************************************************");
        // TODO: approach 2

        int b = 1;
        while (b <= 99){
            if (b % 2 == 1){
                System.out.print(b + " "); }
            b++;
        }

    }
}

package day23_loops;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for ( int i = input.nextInt(); i <= 10; i++){
            System.out.println(i);
        }
    }
}

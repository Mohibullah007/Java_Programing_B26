package day10_scanner;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class evenAndOdd {
    public static void main(String[] args) {


        // even mean joft 2 4 6 8 ...  and odd mean taq 1 3 5 7 ...
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an even number:");
        int num = input.nextInt();
        boolean even = num % 2 == 0;
        boolean odd = num % 2 != 0;

        System.out.println("is this number is even? " + even);
        System.out.println("is this number is odd? " + odd);

    }
}
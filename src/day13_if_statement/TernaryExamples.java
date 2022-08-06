package day13_if_statement;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class TernaryExamples {
    public static void main(String[] args) {

        int num = 3;
        String evenOrOdd;

        if (num % 2 == 0) {
            evenOrOdd = "Even";
        } else {
            evenOrOdd = "Odd"; // todo: if type
        }

        String result = num % 2 == 0 ? "Even" : "Odd";// todo: ternary type
        System.out.println(evenOrOdd);
        System.out.println(result);
        System.out.println("*********************************");

        int a = (0);
        String result2 = (a > 0) ? "Positive" : (a < 0) ? "Negative" : "Zero"; // todo: ternary type
        System.out.println(result2);
        System.out.println("**********************************");

        int time = 12;
        double price;

        String result3 = (time > 12) ? "The price is $12.8" : (time < 12) ? "The price is $13.8" : "The price is $10.0";

        System.out.println(result3);


    }
}
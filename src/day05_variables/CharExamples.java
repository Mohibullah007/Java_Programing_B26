package day05_variables;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class CharExamples {
    public static void main(String[] args) {
        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '%';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo); // letters can not calculated (letterOne = A its 97 letterTwo = Z its 90) so 97 + 90 = 187

        //char letterTree = 65;
        //System.out.println(letterTree);  char letterTree = 'A';


        System.out.println(letterOne + " " + letterTwo + " "  + specialOne + " " + numberOne);
        // putting all our characters into one line.


        System.out.println("\n\tchars: " + letterOne + letterTwo + numberOne + specialOne);


    }

}

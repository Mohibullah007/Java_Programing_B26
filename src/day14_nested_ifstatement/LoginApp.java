package day14_nested_ifstatement;

import java.util.Scanner;

public class LoginApp {
        /*
    inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
    example expected:
        pin: 1552
        ssn: 1234

outputs:

    when the pincode and ssn match the expected print:
        Authentication successful

    when the pincode or ssn are not correct print:
        Authentication failed

    when the pincode was not correct print:
        incorrect pin code

    when the ssn is not correct print:
        invalid ssn
     */
        public static void main(String[] args) {
            int expectedPin = 1552;
            int expectedSSN = 1234;

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your pin:");
            int actualResult = input.nextInt();
            System.out.println("Enter your SSN:");
            int actualResult2 = input.nextInt();

            boolean validPin = actualResult == expectedPin;
            boolean validSSN = actualResult2 == expectedSSN;

            if (validPin && validSSN)      // if (actualResult == expectedPin && actualResult2 == expectedSSN)
                 {
                System.out.println("Authentication successful");
            }else {
                System.out.println("Authentication failed");
                if (!validPin) {  // if (actualResult != expectedPin)
                    System.out.println("invalid Pin code");
                }
                if (!validSSN) {   // if (actualResult2 != expectedSSN)
                    System.out.println("invalid SSN");
                }
            }
        }
}

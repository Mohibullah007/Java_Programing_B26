package day18_string;
   /*

        Ask the user to enter a username
        make sure the username is in lowercase

        Ask the user to enter a password
        check if the password is more than 8 characters long

        valid system password: "jamesbond"

        -> if the entered password matches the system password
            logged in

            otherwise print:

            invalid password
*/

import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the user name");
        String name = input.nextLine();
        name.toLowerCase(); // WE CAN NOT CHANGE THE VALUE OF THE STRING
        name = name.toLowerCase(); // WE HAVE TO REASIGN TO OUR STRING
        System.out.println("Enter a password");
        String password = input.next();

        if (password.length() >= 8 && password.equals("jamesbond")){
            System.out.println("Logged in with " + "\""+name+"\"");
        }else {
            System.out.println("Invalid password");
        }


    }
}

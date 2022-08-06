package day15_switch;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class ArmyExample {
    /*
    Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.

	- The person must be a citizen or a resident
		-> If not print: You must be a citizen or a resident
	- Their age must be between 18 and 35
		-> If not print: Your age must be between 18 to 35 years old
	- They must have a high school diploma
		-> If not print: You must have a high school diploma

	> If all the criteria is met print: You are qualified for the Army
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a citizen?");
        boolean isCitizen = input.nextBoolean();
        System.out.println("Are you resident?");
        boolean isResedent = input.nextBoolean();
        System.out.println("Do you have a high school diploma?");
        boolean hasDiploma = input.nextBoolean();
        System.out.println("How old are you?");
        int age = input.nextInt();

        if ((isCitizen || isResedent) && hasDiploma && (age >= 18 && age <= 35)){
            System.out.println("You are qualified for the army");

        }else {
            if (!isCitizen && !isResedent){
                System.out.println("You must be citizen or a resident");
            }
            if (!hasDiploma){
                System.out.println("you must have a high school diploma");
            }
            if (age < 18 || age > 35){
                System.out.println("your age must be between 18 to 35 years old");
            }
        }
    }
}

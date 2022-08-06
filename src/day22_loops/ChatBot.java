package day22_loops;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keepTalking = true;

        while (keepTalking){

            System.out.println("Enter you massage");
            String msg = input.nextLine();
            msg = msg.toLowerCase();

            switch (msg){
                case "hello":
                    System.out.println("Hi");
                    break;
                case "how are you":
                    System.out.println("I am good");
                    break;
                case "bye":
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Sorry, I don't know what you said");
                    break;
            }
        }
    }
}

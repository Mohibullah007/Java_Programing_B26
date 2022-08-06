package day18_string;

import java.util.Scanner;

/*
  ask the user to enter a message
  clean the message for empty spaces in the beginning and end
  check the message for bad phrases:

      java is bad
      quit
      have fun
      crying

  if there is a bad phrase in the message print:

      message failed to send

  otherwise print:

  $message sent
   */
public class TrimExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a massage");
        String massage = input.nextLine();
        massage = massage.toLowerCase();
        massage = massage.trim();
        boolean valid = massage.contains("java is bad") || massage.contains("bad")|| massage.contains("quit") || massage.contains("have fun") || massage.contains("crying");
        if (valid){
            System.out.println("Massage failed to send"); }else {
            System.out.println("Massage is sent"); }
        System.out.println("******************************************");
        if (massage.contains("java is bad") || massage.contains("bad") || massage.contains("quit") || massage.contains("have fun") || massage.contains("crying")){
            System.out.println("Massage failed to send"); }else {
            System.out.println("Massage is sent"); }




    }
}

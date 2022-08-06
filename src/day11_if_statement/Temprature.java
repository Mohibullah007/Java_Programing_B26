package day11_if_statement;
import java.util.Scanner;
public class Temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please check the Temperature");
        int temperature = input.nextInt();

        if(temperature >= 70){
            System.out.println("Its a nice day\nGo outside, but with your laptop to code java");
        } else {
            System.out.println("It's too cold\nPut a jacket");
        }
    }
}

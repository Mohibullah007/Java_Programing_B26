package day14_nested_ifstatement;

import java.util.Scanner;

public class RealState {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your budget");
        double budget = input.nextInt();

        if (budget >= 0 && budget < 300_000){
            if (budget >= 80_000 && budget <= 100_000){
                String averagePrice = "80_000 - 100_000"; String rating = "4.0"; String gated = "No"; String pits = "yes";
                System.out.println("Name: Hills\nAverage price: "+averagePrice+"\nRating: "+rating+"\nGated: "+gated+"\nAllow pits: "+pits+"\n\n");
            }else if (budget >= 55_000 && budget ==75_000){
                String averagePrice = "55,000 - 75,000"; String rating = "3.5"; String gated = "No"; String pits = "yes";
                System.out.println("Name: Ooks\nAverage price: "+averagePrice+"\nRating: "+rating+"\nGated: "+gated+"\nAllow pits: "+pits+"\n\n");
            }else if (budget >= 120_000 && budget <= 150_000){
                String averagePrice = "120,000 - 150,000"; String rating = "4.5"; String gated = "Yes"; String pits = "No";
                System.out.println("Name: Highland\nAverage price: "+averagePrice+"\nRating: "+rating+"\nGated: "+gated+"\nAllow pits: "+pits+"\n\n");
            }else if (budget >= 160_000 && budget <= 201_000){
                String averagePrice = "160,000 - 201,000"; String rating = "4.8"; String gated = "Yes"; String pits = "Yes";
                System.out.println("Name: Conyon\nAverage price: "+averagePrice+"\nRating: "+rating+"\nGated: "+gated+"\nAllow pits: "+pits+"\n\n");
            }else {
                System.out.println("No available houses");}

        }else {
            if (budget < 0){
                System.out.println("your budget cannot be less than 0");
            }else {
                System.out.println("Too much money for this agency");
            }
        }

        }
    }


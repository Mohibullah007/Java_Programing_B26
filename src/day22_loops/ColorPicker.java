package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int colorPicked = 0;
        String uniqueColors = "";

        while (colorPicked < 3){
            System.out.println("Pick a color");
            String color = input.nextLine();

            if (uniqueColors.contains(color)){
                System.out.println("You already have that color");
            } else {
// TODO: when uniqueColor does not exsist yet then it will continue the process TO THE BELLOW

                uniqueColors += color + " ";
                colorPicked++;
            }
        }
        System.out.print(uniqueColors);

    }
}

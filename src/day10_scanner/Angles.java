package day10_scanner;

import java.util.Scanner;

public class Angles {
    /*
Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
 */


    public static void main(String[] args) {
        System.out.println("Please enter one number of the angle");
        Scanner input = new Scanner(System.in);
        float angle1 = input.nextFloat();
        double angle2 = input.nextDouble();
        double angle3 = input.nextDouble();

        double threeAngle = (angle1 + angle2 + angle3);

        boolean isTriangle = angle1 + angle2 + angle3 == 180;
        boolean isCircle = angle1 + angle2 + angle3 == 360;
        System.out.println("is a triangle: " + isTriangle);
        System.out.println("is a circle: " + isCircle);
    }


}

package day42_custome_classes;

import java.util.Scanner;

public class UsingApp {
    public static void main(String[] args) {

        App cydeo = new App();
        cydeo.name = "CYDEO";
        cydeo.version = 5.5;
        cydeo.isFree = true;

        // we cannot call instance methods
        // like this:
        // App.run();
        // App.update()

        cydeo.run();
        cydeo.update();
        System.out.println("-------------------------------------");
        System.out.println(cydeo.name);
        System.out.println(cydeo.version);
        System.out.println(cydeo.isFree);
        System.out.println("-------------------------------------");
        System.out.println(cydeo);

        new App().run();// this creates an object with no reference and calls the run method

        new Scanner(System.in).nextLine(); // it will use one time in the method


    }
}

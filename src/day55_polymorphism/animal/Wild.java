package day55_polymorphism.animal;

import day50_inheritance.book.Library;

public class Wild {
    public static void main(String[] args) {

        // all possible reference/ object of Lizard

        // itself
        Lizard lizard = new Lizard();
        lizard.eat();

        lizard.name = "lizard";
        lizard.numberOfClaws = 10;
        lizard.skinColor = "camo";

        System.out.println(lizard.name);
        System.out.println(lizard.numberOfClaws);
        System.out.println(lizard.skinColor);

        System.out.println("----------------------------------");
        // super class - reptile
        Reptile reptile = new Lizard();
        reptile.eat();

        reptile.name = "lizard";
        reptile.numberOfClaws = 10;
        //reptile.skinColor = "camo"; reptile reference does not have access to skinColor variable

        System.out.println(reptile.name);
        System.out.println(reptile.numberOfClaws);

        System.out.println("----------------------------------");

        // Super class
        Animal animal = new Lizard();
        animal.eat();

        animal.name = "lizard";
        //animal.numberOfClaws = 10;
        //reptile.skinColor = "camo"; animal and reptile reference does not have access to skinColor variable

        System.out.println(animal.name);

    }
}

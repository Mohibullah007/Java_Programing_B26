package day49_inheritance;

public class Zoo {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.species = "Generic Animal";
        animal.numberOfDogs = 0;
        animal.walk();

        Dog dog = new Dog();
        dog.species = "Dog";
        dog.numberOfDogs = 4;
        dog.bark();
//      dog.roar(); todo: these method is made in subclass not main
        Lion lion = new Lion();
        //Q: How many instance variable does the lion object have access to? 3

        //Q: How many instance variable does the lion object have access to? 2

        lion.roar();
        lion.species = "lion";
        lion.walk();
        //lion.bark(); todo: these method is made in subclass not main
    }
}

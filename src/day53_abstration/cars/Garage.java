package day53_abstration.cars;

public class Garage {
    public static void main(String[] args) {

        //Car obj = new Car():
        //ElectricCar obj1 = new ElectricCar():
        //todo: car and ElectricCar are abstract, so we can not make an object of this class

        Toyota obj2 = new Toyota();
        obj2.start();
        System.out.println("--------------------");
        Honda obj3 = new Honda();
        obj3.start();

        // todo: both toyota and honda were concrete classes,
        //  because the were not abstract, so we had to implement the start method

        System.out.println("--------------------");

        Tesla obj4 = new Tesla();
        obj4.start(); // defined in the Car class
        System.out.println("--------------------");
        obj4.charge(); // defined in the ElectricCar class

        //todo: Tesla was a non-abstract class, so it was concrete,
        // which means it had to override all the abstract methods from the super class
    }
}

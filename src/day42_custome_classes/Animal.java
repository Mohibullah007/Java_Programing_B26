package day42_custome_classes;

public class Animal {

    String species;
    long population;

    public String toString(){
        String print = "Species: " + species;
        print += "\nPopulation: " + population;
        return print;
    }
}

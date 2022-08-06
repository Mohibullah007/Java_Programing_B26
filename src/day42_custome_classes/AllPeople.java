package day42_custome_classes;

public class AllPeople {
    public static void main(String[] args) {

        Person firstPerson = new Person();
        // creates an object of the Person class
        // copy of the object in the Person class

        Person secondPerson = new Person();

        //Accessing the instance variable
        firstPerson.name = "Ali Ahmad";
        firstPerson.age = 26;
        firstPerson.height = 6.5;
        firstPerson.isMarried = false;

        // printing the instance
        System.out.println(firstPerson.name);
        System.out.println(firstPerson.age);
        System.out.println(firstPerson.height);
        System.out.println(firstPerson.isMarried);

        // printing the instance  variables for secondPerson

        System.out.println();

        System.out.println(firstPerson.name);
        System.out.println(firstPerson.age);
        System.out.println(firstPerson.height);
        System.out.println(firstPerson.isMarried);
    }
}

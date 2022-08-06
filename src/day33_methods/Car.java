package day33_methods;

public class Car {
    public static void unlockDoor(){
        System.out.println("Unlocking the car");
    }
    public static void openDoor(){
        System.out.println("Opening the door");
    }
    public static void sitInCar(){
        System.out.println("Sitting in the car");
        System.out.println("Close the door");
    }
    public static void getReadyToGo(){
        System.out.println("Putting on seatbelt");
        System.out.println("Checking the mirrors");
        System.out.println("Put on music");
        System.out.println("Put on navigation");
    }
    public static void startCar(){
        System.out.println("Starting car");
    }
    public static void driveAndGo(){
        System.out.println("Putting car into drive");
        System.out.println("Going forwards");
    }
    public static void inHurry(){
        unlockDoor();
        sitInCar();
        startCar();
        driveAndGo();
    }

    public static void main(String[] args) {
        unlockDoor();
        openDoor();
        sitInCar();
        getReadyToGo();
        startCar();

        System.out.println();

        inHurry();
        System.out.println("hear police siren");
        getReadyToGo();
    }
}

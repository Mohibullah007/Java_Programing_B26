package day05_variables;
/*
add new class CarInfo
add main method
declare and assign these variables:

    car model, driver name, license number, speed, is automatic, liscense class (char)
 */


public class CarInfo {
    public static void main(String[] args) {
        String carModel = "Luxes LX 2022";
        String driverName = "MF";
        int licenseNumber = 85468416;
        int speed = 360;
        boolean isAutomatic = true;
        char licenseClass = 'D';

        System.out.println("Car Info: \n\t Car Model:  "+carModel+"\n\t Driver Name:  "+driverName+"\n\t License Number:  "+licenseNumber+"\n\t Speed:  "+speed+"\n\t Is it Automatic:  "
        +isAutomatic+"\n\t License Class:  "+licenseClass);

    }
}

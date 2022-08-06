package day10_scanner;
import java.util.Scanner;
public class Apartment {
    /*
        Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the address:");
        String add = input.next();

        System.out.println("Owner Name?");
        String name = input.next();

        System.out.println("Number of Units:");
        String units = input.next();

        System.out.println("average size of each units:");
        double sizeOfUnits = input.nextDouble();

        System.out.println(" Monthly rent amount:");
        int rent = input.nextInt();

        System.out.println("Numbers of Washers and Driers:");
        int washersDriers = input.nextInt();

        System.out.println("Allows pets or no:");
        boolean pets = input.nextBoolean();

        System.out.println("Has a pool?");
        boolean pool = input.nextBoolean();

        System.out.println("Length of Lease?");
        int lengthOfLease = input.nextInt();

        System.out.println("Total number of residents in building:");
        int people = input.nextInt();

        System.out.println("Phone number of owner:");
        int ownerNumber = input.nextInt();

        System.out.println("Is near a gas station:");
        int station = input.nextInt();

        System.out.println("Number of floors:");
        int numberOfFloors = input.nextInt();

        System.out.println("Has a basement:");
        boolean basement = input.nextBoolean();

        System.out.println("Has available units for rent:");
        boolean rent1 = input.nextBoolean();

        System.out.println("Has air conditioning");
        boolean aircondition = input.nextBoolean();

        System.out.println("Number of parking spaces:");
        int parking = input.nextInt();

        System.out.println("Has wheel chair access");
        boolean access = input.nextBoolean();

        System.out.println("Number of review stars (out of 5)");
        int review = input.nextInt();

        double percent = rent * 0.1;
        double discountAfter3Years = rent - percent;
        System.out.println("monthly rent after 3 years (discount 10% off original rent)is " + discountAfter3Years);

        double percent2 = rent * 0.2;
        double discountAfter6Years = rent - percent2;
        System.out.println("Monthly rent after 6 years (discount 20% off original rent) is " + discountAfter6Years);

        



    }
}

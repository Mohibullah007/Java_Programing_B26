package day32_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String[][] cydeo = new String[4][];

        System.out.println("Assigning first group");
        String[] groupOne = {"Emre", "Yasir", "Eda"};
        cydeo[0] = groupOne;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Assigning second group");
        String[] groupTwo = {"Basri", "Demet", "Shina", "Ismayil"};
        cydeo[1] = groupTwo;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Assigning third group");
        cydeo[2] = new String[]{"Mustafa", "Lima"}; // TODO WE doesn't assign 3D its @D so we have to add it into our 2D
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Assigning group 3 as group 4");
        cydeo[3] = cydeo[2];
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("=================================================================================");
        System.out.println("With loops:\n");

        for (String[] innerArray : cydeo) { // loops through the 2D array, cydeo

            for (String eachWord : innerArray) { // loops through every String element in each 1D inner array
                System.out.println(eachWord);
            }
        }
    }
}

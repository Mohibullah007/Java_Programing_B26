package day07_unary_operators;
/*
create a class Pizza
add a main method
declare and assign these variables:

   type of pizza,  the number of slices,  the number of people eating

calculate how many slices each person will get
calculate how many slices are left over

Sample print statement:

   We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
 */
public class Pizza {
    public static void main(String[] args) {

        String typeOfPizza = "Cheese";
        int numberOfSlices = 8;
        int numberOfPeople = 4;
        int slicesPerPeople = numberOfSlices / numberOfPeople;
        int slicesLeftOver = numberOfSlices % numberOfPeople;

        System.out.println("Pizza Type:\t"+ typeOfPizza + ", with "+ numberOfSlices+
                " slices and there is 4 People, so How much they will get equally? and how much is remain?");
        System.out.println("slices per Each are:\t"+slicesPerPeople+"\nThe remaining slices are:\t"+ slicesLeftOver);
    }

}

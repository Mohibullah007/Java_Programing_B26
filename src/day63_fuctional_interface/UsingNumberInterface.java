package day63_fuctional_interface;

public class UsingNumberInterface {
    public static void main(String[] args) {

        NumberInterface evenOrOdd = (number) -> {
            if (number % 2 == 0){
                System.out.println(number + " is even");
            }else {
                System.out.println(number + " is odd");
            }
        };

        evenOrOdd.apply(20);
        evenOrOdd.apply(25);

        NumberInterface cube = (number) -> {
            System.out.println(number * number * number);
        };

        cube.apply(3);
        cube.apply(4);
    }
}

package day15_switch;

public class NumberWords {
    public static void main(String[] args) {
        int n = 5;
        // as if statement
        if (n == 1) {
            System.out.println("One");
        } else if (n == 2) {
            System.out.println("Two");
        } else if (n == 3) {
            System.out.println("Three");
        } else if (n == 4) {
            System.out.println("Four");
        } else if (n == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Invalid Number");
        }
        System.out.println("****************************************");
        // as switch statement
        switch (n) {
            case 1:  // if statement (n == 1)
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid Number");


        }
    }
}

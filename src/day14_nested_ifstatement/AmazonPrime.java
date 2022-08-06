package day14_nested_ifstatement;

public class AmazonPrime {
    /*
    task: declare and assign a price variable
     */
    public static void main(String[] args) {
        int num = 26;
        boolean hasPrime = false;

        if (hasPrime) {
            System.out.println("eligible for 2 days shipping");
        } else {
            if (num >= 25) {
                System.out.println("eligible for regular free shipping");
            } else {
                System.out.println("not eligible for regular free shipping. shipping fee: 3.99");
            }
        }
        }
    }

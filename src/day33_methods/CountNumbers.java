package day33_methods;

public class CountNumbers {
    public static void certainNumbers(int num){

        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        certainNumbers(5);
        certainNumbers(20);
        certainNumbers(10);
    }
}

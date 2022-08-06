package day21_loops;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("**************");

        int num = 1;
        while(num <= 100){
            System.out.println("Hello World " + num++);
        }
        System.out.println("******************");
        int z = 1;
        while (z <= 50){
            System.out.println("Hello Universe " + z);
            z++;
            // todo: everything in the brakets {} is repeating

            /*
            flow of above:
            z = 1
            z <= 50 --> 1 <= true --> goes into loop
            run code: System.out.println("Hello universe " + z);
            z++ its post increment so noting will happened
            output --> Hello Universe 1

            z = 2 todo: we had post increment for it
            z <= 50 --> 1 <= true --> goes into loop
            run code: System.out.println("Hello universe " + z);
            z++ todo: its post increment so noting will happened
            output --> Hello Universe 2

            up to 50

             */
        }
    }
}

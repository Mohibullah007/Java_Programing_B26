package day22_loops;

public class DoWhileExample {
    public static void main(String[] args) {

        int a = 0;

        do{
            // TODO: everything between the curly brackets are in the loop
            System.out.print(a + " ");
            a++;
        }while (a < 10);
        System.out.println("\n*****************");
        System.out.println("With false statement");

        int a2 = 0;

        do{
            // TODO: everything between the curly brackets are in the loop
            System.out.println(a2);
            a2++;
        }while (a2 == 10);

    }
}

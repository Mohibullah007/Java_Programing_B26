package day24_loops;

public class BranchingExample {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n*******************");
        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");
            break;
        }
        System.out.println("\n*******************");
        for (int i = 0; i < 10; i++){
        System.out.print(i + " ");
        if (i == 5){
        break;}
    }
        System.out.println();
        for (int i = 0; i <= 100; i++){

            if (i % 2 == 1){
                continue; // TODO:
            }
            System.out.print(i + " ");
        }
    }
}


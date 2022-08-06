package day26_nested_loops;

public class NestedLoopExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello word");

        }
        System.out.println("Hello Universe");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello word");

        }
        System.out.println("Hello Universe");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello word");

        }
        System.out.println("Hello Universe");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello word");

        }
        System.out.println("Hello Universe");

        System.out.println("==============================================================");

        // outer loop
        System.out.println("With Nested Loop");
        for (int j = 0; j < 4; j++) {

            // inner loop
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello word");

            }
            System.out.println("Hello Universe");
            System.out.println();
        }
    }
}

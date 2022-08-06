package day22_loops;

public class Letters {
    public static void main(String[] args) {
        // letters from a - z
        char lowerCaseUp = 'a';

        while (lowerCaseUp <= 'z'){
            System.out.print(lowerCaseUp + " ");
            lowerCaseUp++;
        }
        System.out.println("\n*********************************************************************************************");
        char upperCaseBack = 'Z';

        while ( upperCaseBack >= 'A'){
            System.out.print(upperCaseBack + " ");
            upperCaseBack--;
        }
        System.out.println("\n*********************************************************************************************");

        char a = 'ا';

        while ( a <= 'ی'){
            System.out.print(a + " ");
            a++;
        }
    }
}

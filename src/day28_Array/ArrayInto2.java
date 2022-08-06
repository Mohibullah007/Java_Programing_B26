package day28_Array;
import java.util.Arrays;
public class ArrayInto2 {
    public static void main(String[] args) {

        double [] arr = new double[4]; // TODO: MEANS WE HAVE 4 POSSIBLE ELEMENTS
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        arr[0] = 30.99;
        System.out.println(Arrays.toString(arr));

        arr[1] = 12.55;
        arr[2] = 10.25;
        arr[3] = 5;
        System.out.println(Arrays.toString(arr));
        // reassigning
        arr[2] = 2000;
        System.out.println(Arrays.toString(arr));

        arr = new double[5]; // here we are creating a new arrays with five element
        System.out.println(Arrays.toString(arr));
    }
}

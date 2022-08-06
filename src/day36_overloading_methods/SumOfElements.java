package day36_overloading_methods;

public class SumOfElements {
    public static void main(String[] args) {
        int [] arr = {1, 5, 6, 2};
        System.out.println(sum(arr));
    }
    public static int sum(int ... nums){ // TODO: we can also use 3 dot (...) beside array ([])
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;
    }
// regular
//public static int sum(int[] nums){
//    int sum = 0;
//    for (int each : nums) {
//        sum += each;
//    }
//    return sum;
//}

}

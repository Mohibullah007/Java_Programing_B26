package day35_methods;

public class mainNumberInArray {
    public static int minNumber(int [] nums){

        int min = nums[0];
        for (int num : nums){
            if (num < min){
                min = num;
            }
        }
        return min;
    }
    public static int maxNumber(int [] nums){

        int max = nums[0];
        for (int num : nums){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

}

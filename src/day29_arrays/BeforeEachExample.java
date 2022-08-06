package day29_arrays;

public class BeforeEachExample {
    public static void main(String[] args) {
        int [] nums  = {30, 12, 159, 12};
//TODO: traditional
        for (int i = 0; i < nums.length; i++) {
            System.out.println("traditional " + nums[i]);

        }
        System.out.println("===========================");
        for (int element : nums){
            System.out.println("for each: " + element);
        }
        System.out.println("===========================");
        // String example
        String [] classes = {"java", "soft skills" , "selenium" , "database" , "api"};
        //traditional
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }
        System.out.println("==========================");
        // for each
        for (String word : classes){
            System.out.println(word);
        }
    }
}

package day23_loops;

public class CountHi {
    public static void main(String[] args) {
        String str = "aljkjhilkjhijdhfhhiihi";
        int count = 0;

        for (int index = 0; index <= str.length() -1; index++){

            if (str.charAt(index) == 'h' && str.charAt(index + 1 ) == 'i'){
                count++;
            }
            // TODO: when we gonna try to find more than one character we have to stop the program by using
            //  "<=length() - the number of required characters  
        }
    }
}

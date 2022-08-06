package day64_functional_interface;

import java.util.function.Predicate;

public class recap {
    public static void main(String[] args) {

        Predicate<Integer> verifyDuplicates = n -> {

            String str = n + "";
            String unique = "";

            for (int i = 0; i < str.length(); i++) {
                if (!unique.contains(str.charAt(i) + "")){
                    unique += str.charAt(i);
                }else {
                    return true;
                }
            }
            return false;
        };

        System.out.println("verifyDuplicates.test(1234) = " + verifyDuplicates.test(1234));
        System.out.println("verifyDuplicates.test(12324) = " + verifyDuplicates.test(12324));
    }
}

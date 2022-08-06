package day20_string;

public class IndexOfExample {
    public static void main(String[] args) {

        String word = "banana";
            //         012345
        int firstIndex = word.indexOf('a'); // it reads from the starts
        System.out.println(firstIndex);
        int lastIndex = word.lastIndexOf('a');
        System.out.println(lastIndex); // it reads from the ends

        int secondIndex = word.indexOf('a', firstIndex + 1);
        System.out.println(secondIndex);

        int thirdIndex = word.indexOf('a', secondIndex + 1);
        System.out.println(thirdIndex);
        System.out.println("*******************************************************");
        String s = "Welcome to Java shopping center your code is: 12418113171";
        // how you gonna hardcoded it, if developer change it your code gonna fail so we have to ignore hardcoding.
        int num1 = s.indexOf('1');
        int num2 = s.indexOf('1', num1 +1);
        int num3 = s.indexOf('1', num2 +1);
        int num4 = s.indexOf('1', num3 +1);
        int num5 = s.indexOf('1', num4 +1);
        int num6 = s.lastIndexOf('1');
        System.out.println(num1+" \n"+num2+" \n"+num3+" \n"+num4+" \n"+num5+" \n"+num6);

    }
}

package day24_loops;
/*
    java is a language
    0123
    how many times java counted
    java 0, 4  i, i + 4
    ava  1, 5  i, i + 4
    va i 2,6
     */
public class CountJava {
    public static void main(String[] args) {
        String str = "java is a java language.java";
        int count = 0;

        for (int i = 0; i < str.length() -3; i++){
            String everyFour = str.substring(i, i + 4);
            //System.out.print(everyFour);
            // todo: it will give you "java ava  va i a is  is  is a s a   a j a ja  jav java ava  va l a la  lan lang angu ngua guag uage"
            if (everyFour.equals("java")){
                count++;
            }
        }
        System.out.println(count);
    }
}

package day17_string;

public class StringMemory {
    public static void main(String[] args) {
       String first = "java";
       String second = "java";
       // String literal, in String pool

        System.out.println(first == second);// it will gives as true, it compare the memory object, and take memory of one object

        String str = new String("java"); //String object, not in String pool, but directly in the heap
        System.out.println(first == str); // it gives as false, the == doesn't compare the characters, it compare the memory object

        String str2 = new String("java");
        System.out.println(str == str2);

        String third = "Java";
        System.out.println(first == third); // it will give you false directly, because every character is different in java language.
    }
}

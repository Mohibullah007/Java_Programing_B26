package day54_abstruction.language;

public class Translator {
    public static void main(String[] args) {

        Spanish spanish = new Spanish();
        spanish.hi();
        spanish.bye();

        System.out.println("-------------------");
        Turkish turkish = new Turkish();
        turkish.hi();
        turkish.bye();
    }
}

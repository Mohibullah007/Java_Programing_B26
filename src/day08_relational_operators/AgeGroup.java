package day08_relational_operators;
/*
    task:

        declare and assign an age variable

        is the person a kid ( up to 13, include 13)

        is the person a senior citizen ( 65 and above)

     */
public class AgeGroup {
    public static void main(String[] args) {
        int age = 20;

        boolean isKid = age <= 13;
        boolean isSenior = age >=65;

        System.out.println("You are a Kid: " +isKid);
        System.out.println("You are a senior: "+isSenior);
        System.out.println("======================================");
        int age1 = 13;
        boolean isKid1 = age1 <= 13;
        boolean isSenior1 = age1 >=65;

        System.out.println("You are a Kid: " +isKid1);
        System.out.println("You are a senior: "+isSenior1);
    }
}

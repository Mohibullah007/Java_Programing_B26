package day53_abstration.exercise;

public class Gym {
    public static void main(String[] args) {

        Running obj1 = new Running();
        System.out.println(obj1.name);
        obj1.performExercise();
        System.out.println("------------------------");
        System.out.println(obj1.getCaloriesBurned(20));

    }
}

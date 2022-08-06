package day12_if_statement;

public class DayOfWeek {
    public static void main(String[] args) {
        int number = 6;

        if (number == 1){
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("tuesday");
        } else if (number == 3){
            System.out.println("wensday");
        }else if (number == 4){
            System.out.println("thirsday");
        }else if (number == 5){
            System.out.println("friday");
        }else if (number == 6){
            System.out.println("Saturday");
        }else if (number == 7){
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day number"); }

    }

}
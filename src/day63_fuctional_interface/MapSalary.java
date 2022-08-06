package day63_fuctional_interface;

import day54_abstruction.creating.Create;

import java.util.HashMap;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {
//        Create a map that has a couple data to use. The data will be a name as the key and a salary as the value
//        Use the created map to find the following:

        Map<String, Double> map = new HashMap<>();
        map.put("James", 70000.0);
        map.put("Jane", 30000.0);
        map.put("Ana", 140000.15);
        map.put("Jorge", 42452512.23);
        map.put("Elza", 123131214.1);
        map.put("Peter", 231234.0);

//        1.1 who has the maximum salary?
        String nameForLargest = "";
        double maxSalary = Double.MIN_VALUE; // TODO: the smallest possible double value is a good starting value

//        1.2 who has the minimum salary?
        String nameForLowest = "";
        double lowestSalary = Double.MAX_VALUE; // TODO: the biggest possible double value is a good starting value

        for (String key : map.keySet()){

            double value = map.get(key);

            if (value > maxSalary){
                nameForLargest = key;
                maxSalary = value;
            }
            if (value < lowestSalary){
                nameForLowest = key;
                lowestSalary = value;
            }
        }

        System.out.println("Max Salary: " + nameForLargest + " - $" + maxSalary);
        System.out.println("Min Salary: " + nameForLowest + " - $" + lowestSalary);

        System.out.println("-----------------------------------------------------");

//      1.3 how many employees has the salary between 120k ~ 150K?
        int counter = 0;

        for (double value : map.values()){

            if (value >= 120_000 && value <= 150_000){
                counter++;
            }
        }
        System.out.println("Number of employees morethan 120k and less than 150K: " + counter);
        System.out.println("-----------------------------------------------------");

//     1.4 display the names of the employees who are making less than 118k?

        for (String names : map.keySet()){
            if (map.get(names) <= 218_000){
                System.out.println(names);
            }
        }
        System.out.println("-----------------------------------------------------");

//        1.5 increase the salary of each employee by 10K
        for(String key : map.keySet()){
            map.put(key, map.get(key) + 10_000);
        }
        System.out.println(map);


    }
}


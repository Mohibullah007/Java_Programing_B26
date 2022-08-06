package day05_variables;

public class TypeCasting2 {
    /*
    create a class EmployeeInfo
    create a main method
    declare and assign these variables:
        first name, last name, gender, age, company name, are the fulltime, job title, salary, number of pto, are they married, suite(char - A, B, C, D)
     */
    public static void main(String[] args) {
        String name;
        String last_name;
        String company_name;
        String job_title;
        char gender;
        byte age;
        boolean full_time;
        int salary;
        byte number_of_PTO;
        boolean married;
        char suit;

        name = "Jan";
        last_name = "Wieck";
        company_name = "Marvel";
        job_title = "Actor";
        gender = 'M';
        age = 34;
        full_time = false;
        salary = 5_000_000;
        number_of_PTO = 20;
        married = false;
        suit = 'A';

        String Bio = "  Bio:\n **************************************************" + "\n\tName:\t" + name +
                "\n\tLast Name:\t" + last_name + "\n\tTitle:\t" + job_title + "\n\tIndustry:\t" + company_name +
                "\n\tGender:\t" + gender + "\n\tAge:\t" + age +"-Years old" + "\n\tIs he Full-time?\t" + full_time +
                "\n\tSalary:\t" + salary + "\n\tPTO:\t" + number_of_PTO + "Is He Married?\t" + married +
                "\n\tSuit\t" + suit + "\n **************************************************";


        System.out.println(Bio);

    }


}

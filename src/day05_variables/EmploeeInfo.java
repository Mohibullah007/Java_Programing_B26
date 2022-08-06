package day05_variables;

public class EmploeeInfo {

    /*  create a class EmployeeInfo
    create a main method
    declare and assign these variables:
        first name, last name, gender, age, company name, are the fulltime, job title, salary, number of pto, are they married, suite(char - A, B, C, D)

     */

    public static void main(String[] args) {
        String name = "Ahmad";
        String last = "Ali";
        char gender = 'M';
        int age = 28;
        String companyName = "TI LLC";
        String jobType = "Full time";
        String jobTitle = "SDET";
        boolean married = true;
        double pto = 2.5;
        char suite = 'B';
        int salary = 1_000_000; // 1,000,000 - to do it more readable we are using (_) underscore because int cant read comma.



        System.out.println("Name:\t"+name);
        System.out.println("Last Name:\t"+last);
        System.out.println("Gender:\t"+gender);
        System.out.println("Age:\t"+age);
        System.out.println("Company Name:\t"+companyName);
        System.out.println("Job Title:\t"+jobTitle);
        System.out.println("Job Type:\t"+jobType);
        System.out.println("Married:\t"+married);
        System.out.println("PTO:\t"+pto);
        System.out.println("Suite:\t"+suite);
        System.out.println("Salary:\t"+salary);

    }
}

package day46_static;

public class CydeoStudent {

    String name;
    int groupNumber;

    static int batchNumber;
    static String [] instructors;
    static String schoolName;

    static {
        batchNumber = 26;
        instructors = new String[]{"Nadir", "Mehmet", "Aysun", "Saim"};
        schoolName = "Cydeo";
        printInfo();
    }

    public CydeoStudent(String name, int groupNumber){
        this.name = name;
        this.groupNumber = groupNumber;
    }
    public static void printInfo(){
        System.out.println("School Name " + schoolName);
        System.out.println("Batch Number " + batchNumber);
        System.out.println("Instructors " + instructors);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}

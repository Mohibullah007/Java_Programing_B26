package day09_Scanners;
/*

            name
            are they citizen
            do have criminal background
            age

        determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are about age 18
 */
public class LogicalPractice2 {
    public static void main(String[] args) {
        String name = "JemesBond";
        boolean isCitizen = true;
        boolean hasCriminalBackground = false;
        int age = 49;

        boolean isEligibleToVote = age >= 18 && isCitizen && !hasCriminalBackground; // true && true && (!false -> true)

        System.out.println(name + " is eligible to vote: " + isEligibleToVote);

        // !true -> false or !false -> true

    }
}

package day13_if_statement;

public class IfWithoutBrackets {
    public static void main(String[] args) {
        if (4>2)
            System.out.println("Hello");
// if statement without brackets does not attach morethan one line with your if statement
        if (4>10)
            System.out.println("bye");
            System.out.println("other line");// this has noting to do with the if statement

        if (2==2)
            System.out.println("2 number");
            //todo:System.out.println();
         else if (4>3) // todo: when we add one more line the if statement without brackets cannot recognise else if statement

            System.out.println("other line2");
        else if (6<8)
        System.out.println("dont do it");
    }
}

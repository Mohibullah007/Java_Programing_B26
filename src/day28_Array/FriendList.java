package day28_Array;

import java.util.Arrays;
import java.util.Scanner;

/*

       Make an array of your friends names

       asking how many friends do you have

       then ask for each friend's name one at a time, store all the names into an array

       at the end print your friend list
    */
public class FriendList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many friends do you have");
        int size = input.nextInt();

        String[] frindList = new String[size];

        for (int i = 0; i < frindList.length; i++) {
            System.out.println("Enter your friend name");
            frindList[i] = input.next();

        }

       System.out.println(Arrays.toString(frindList));
    }
}

package day30_Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String a = "Today is Monday";
        String [] reverse = a.split(" ");
        String reversed = "";
        for (int i = reverse.length -1; i >= 0 ; i--) {
            reversed += reverse[i] + " ";
        }
        System.out.println(reversed);
    }
}

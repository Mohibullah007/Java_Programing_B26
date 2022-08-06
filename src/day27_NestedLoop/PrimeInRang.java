package day27_NestedLoop;
/*
  [IQ] Prime in range

  Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

  Ex:
      Input:
          50
      Output:
          2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
   */
public class PrimeInRang {
    public static void main(String[] args) {
        int range = 50;
        for (int i = 2; i < range; i++) {// TODO: the purpose of this loop is is to check all the numbers from 2 to the
            // TODO --> value the range variable
            int count = 0; // TODO: putting the counter inside the outer loop will reset it back to 0 for the next number

            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    count++;
                }
            }//TODO: end of inner loop
            if (count == 0){
                System.out.print(i + ", "); // TODO: it will check and print prime numbers
            }
        }
    }
}

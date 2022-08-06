package day08_relational_operators;

/*
   declare and assign a gift card with 200
           buy 2 items. buy 1 item for x price and subtract from your gift card
           buy item 2 for x price and subtract from your gift card
           print the remaining balance of your gift card
           */
public class GiftCard {
    public static void main(String[] args) {
        double giftCard = 200;
        giftCard -= 20.70;
        System.out.println("I buy 1 item in $20.70 and the remaining balance is: $"+giftCard);

        giftCard -= 118.30;
        System.out.println("I buy two item in $118.30 and the remaining balance is: $"+giftCard);

    }
}

package day55_polymorphism.shopping;

public class Runner {
    public static void main(String[] args) {

        /*

        Shopping and OnlineShopping are abstract class, so we can't make object of them

        Shipping is an interface, so we can't make an object ot item
         */

        Target target = new Target();
        target.price = 10;
        target.buyItem();
        target.returnItem();

        //target.payForShopping(true); target class does not implement the Shipping interface

        Amazon amazon = new Amazon();
        amazon.price = 1000;
        amazon.buyItem();
        amazon.returnItem();
        amazon.payForShopping(true);
        amazon.viewCart();
        System.out.println(amazon.contry);

        System.out.println(Shipping.contry);  // the proper way to access static information in the interface
    }
}

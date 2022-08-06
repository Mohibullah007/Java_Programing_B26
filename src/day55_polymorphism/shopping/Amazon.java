package day55_polymorphism.shopping;

public final class Amazon extends OnlineShopping{

    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon cart");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Return to Amazon drop location");
    }

    @Override
    public void payForShopping(boolean b) {
        System.out.println(b ? "Pay for shopping" : "Free shopping");
    }
}

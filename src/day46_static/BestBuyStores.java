package day46_static;

public class BestBuyStores {
    public static void main(String[] args) {
        // access the static members by the class name
        System.out.println(BestBuy.headquarters);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.numberOfComputer);

        BestBuy store1 = new BestBuy("Oak Drive");
        System.out.println(store1.location); // accessing the instance variable
        System.out.println(store1.numberOfComputer);

        BestBuy.numberOfComputer--;
        System.out.println(store1.numberOfComputer);

        BestBuy store2 = new BestBuy("Fairfax");
        System.out.println(store1.location);
        System.out.println(store2.location);

        BestBuy.reStock();
        System.out.println(BestBuy.numberOfComputer);
        store1.reStock();
        System.out.println(BestBuy.numberOfComputer);

        // BestBuy.openStore() TODO: WE CAN NOT USE THIS

        store1.openStore();
        store2.openStore();

    }
}

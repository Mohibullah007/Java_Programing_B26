package day42_custome_classes;

public class Item {

    String name;
    double price;


    @Override // can ignore, even delete if you want
    public String toString() {
        return "Item{" +
                "name: '" + name + '\'' +
                ", price: " + price +
                '}';
    }
}

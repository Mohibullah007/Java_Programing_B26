package day29_arrays;

public class MostExpensiveItem {
    public static void main(String[] args) {
        String [] items = { "Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack" };
        double [] prices = { 89.99, 150.0, 99.99, 650.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350 };


        double  mostExpensive = prices[0];
        int indexOfMostExpensive = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > mostExpensive){
               mostExpensive = prices[i];
               indexOfMostExpensive = i;
            }
        }
        System.out.println("The most expensive item: ");
        System.out.println("Item: " + items[indexOfMostExpensive]);
        System.out.println("Item ID: " + itemIds[indexOfMostExpensive]);
        System.out.println("Prices: $" + prices[indexOfMostExpensive]);
    }
}

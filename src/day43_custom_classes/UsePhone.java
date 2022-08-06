package day43_custom_classes;

public class UsePhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone("iPhone 13 Pro Max");
        System.out.println(phone1);
        Phone phone2 = new Phone("iPhone 13 Pro Max", "Apple");
        System.out.println(phone2);
        Phone phone3 = new Phone("iPhone 13 Pro Max", "Apple",
                512, 15.4);
        System.out.println(phone3);
    }
}

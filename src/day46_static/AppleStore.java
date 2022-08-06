package day46_static;

public class AppleStore {
    public static void main(String[] args) {

        IPhone phone = new IPhone("iPhone X", 500);
        System.out.println(phone);

        IPhone phone2 = new IPhone("iPhone 13 Pro-Max", 1200);
        System.out.println(phone2);

        System.out.println(IPhone.company);
        System.out.println(IPhone.os);

    }
}

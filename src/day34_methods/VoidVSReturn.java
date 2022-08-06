package day34_methods;

public class VoidVSReturn {
    public static void main(String[] args) {
        sayHello();
        // String msg = sayHello();
        // System.out.println(sayHello()); TODO: not returns you any value back

        sayBye(); // TODO: it will not give you any value back
        System.out.println(sayBye());
        System.out.println("---------");
        String msg = sayBye();
        System.out.println(msg);
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static String sayBye() {
        return "bye";

    }

}

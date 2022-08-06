package day47_encapsulation;

public class AccessPackage {

    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
//        System.out.println(obj.c);

        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
//        System.out.println(AccessModifier.z);

        //TODO: c and z is not accessible here coz they are private

    }
}

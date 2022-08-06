package day05_variables;

public class TypeCasting {
    public static void main(String[] args) {
        byte b = 40;
        int i = b;
        // the byte value is automatically converted to int,because byte is smaller than int.

        int i2 = 100;
        byte b2 = (byte) i2;
        // int is bigger than byte, so we must cast.   we cast the int type - i2 to a byte type using (byte)



        long l2 = 200;
        int i4 = (int)l2;





    }
}

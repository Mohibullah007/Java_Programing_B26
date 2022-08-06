package day56_polymorphism.book;

public class Library {
    public static void main(String[] args) {

        JavaTextbook book1 = new JavaTextbook();
        book1.name = "Java Programming";
        book1.size = 20.5;
        book1.fun = true;
        book1.read();
        book1.open();
        book1.download();

        System.out.println("--------------------------------------------------");

        EBook book2 = new JavaTextbook();
        book2.name = "Java Programming";
        book2.size = 20.5;
        // book2.fun = true; EBook reference
        // does not have access to the fun variable.
        // TODO: CASTING (DOWN CASTING)
        ((JavaTextbook)book2).fun = true;

        book2.read();
        book2.open();
        book2.download();

        System.out.println("--------------------------------------------------");

         Book book3 = new JavaTextbook();
        book3.name = "Java Programming";

        //book3.size = 20.5;
        ((JavaTextbook)book3).size = 20.5;

        //book3.fun = true;
        ((JavaTextbook)book3).fun = true;

        book3.read();

        //book3.open();
        ((JavaTextbook)book3).open();

        //book3.download();
        ((JavaTextbook)book3).download();

        // Book reference only has access to the name variable and the read variable

        System.out.println("--------------------------------------------------");

        Downloadable book4 = new JavaTextbook();

//        book4.name = "Java Programming";
        ((JavaTextbook)book4).name = "Java Programming";

//        book4.size = 20.5;
        ((JavaTextbook)book4).size = 20.5;

//        book4.fun = true;
        ((JavaTextbook)book4).fun = false;

//        book4.read();
        ((JavaTextbook)book4).read();

//        book4.open();
        ((JavaTextbook)book4).open();

        book4.download();

        // The only thing accessible by the Downloadable interface is the download method
    }
}

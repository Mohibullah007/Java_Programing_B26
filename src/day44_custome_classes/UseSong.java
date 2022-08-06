package day44_custome_classes;

public class UseSong {
    public static void main(String[] args) {

        Song song1 = new Song("Afrin Afrin");
        System.out.println(song1);

        Song song2 = new Song("Dil Sambleja Za", 3.5);
        System.out.println(song2);

        Song song3 = new Song("thriller", 4.0, "Michel Jackson", "Pop");
        System.out.println(song3);
    }
}

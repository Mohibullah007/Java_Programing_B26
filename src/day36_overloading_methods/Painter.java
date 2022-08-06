package day36_overloading_methods;

public class Painter {
    public static void main(String[] args) {

        Picture.draw(); // it will run the first one
        Picture.draw(100); // it will run draw with int variable
        Picture.draw("red"); // it will run the one with having One String variable
        Picture.draw("blue", "green"); // it will run the one with two String

        String s = "200";
        Picture.draw(s); // it will run the one with having just one String variable

        Picture.draw(100, "Blue");
        Picture.draw("black", 500);
    }
}

package day51_inheritance.shape;

public class Square extends Shape{

    double side;

    public Square(double side){
        super("Square");
        this.side = side;
    }

    @Override
    public double area(){
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", name=" + name + '}';
    }
}

package Oops.Four_Pillars.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        Shapes s = new Circle();
        s.area();//

        shapes.area();
    }
}
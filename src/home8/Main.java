package home8;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Triangle(10, 2), new Circle(10), new Rectangle(10, 2),
        new Rectangle(10, 41), new Circle(31)};

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }

    }
}

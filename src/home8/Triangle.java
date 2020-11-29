package home8;

public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle(double height, double base){
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.base * this.base / 2;
    }
}

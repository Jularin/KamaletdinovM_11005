package home5;

public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void add(Vector2D otherVector){
        this.x += otherVector.x;
        this.y += otherVector.y;
    }
    public void sub(Vector2D otherVector){
        this.x -= otherVector.x;
        this.y -= otherVector.y;
    }
    public void mult(double t){
        this.x *= t;
        this.y *= t;
    }
}

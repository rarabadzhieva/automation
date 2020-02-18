package chapter20;

public class Rectangle extends Shape {

    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public double calculateSurface() {
        return width*height;
    }

    @Override
    public String shapeType() {
        return "Rectangle";
    }
}

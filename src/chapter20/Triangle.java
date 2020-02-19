package chapter20;

public class Triangle extends Shape {

    public Triangle(int width, int height) {
        super(width, height);
    }

    @Override
    public double calculateSurface() {
        return ((width*height)/2);
    }

    @Override
    public String shapeType() {
        return "Triangle";
    }
}

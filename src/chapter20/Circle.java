package chapter20;

public class Circle extends Shape {

    public Circle(int radius) {
        super(radius, radius);
    }

    @Override
    public double calculateSurface() {
        return Math.PI*width*width;
    }

    @Override
    public String shapeType() {
        return "Circle";
    }
}

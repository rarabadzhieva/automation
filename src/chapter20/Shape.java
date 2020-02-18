package chapter20;

public abstract class Shape {

    public int width;
    public int height;

    public Shape(int width, int height) {
        this.width=width;
        this.height=height;
    }

    public abstract double calculateSurface();

    public abstract String shapeType();
}

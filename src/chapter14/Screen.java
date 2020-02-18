package chapter14;

public class Screen {

    private int width;
    private int colors;

    public Screen(int width) {
        this(width, 0);
    }

    public Screen(int width, int colors) {
        this.width = width;
        this.colors = colors;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getColors() {
        return colors;
    }

    public void setColors(int colors) {
        this.colors = colors;
    }
}

package _05_class.d_practice;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width) {
        this.width = width;
    }

    public int getArea() {
        return width * height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}//class

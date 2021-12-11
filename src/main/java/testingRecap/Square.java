
package testingRecap;

public class Square {

    private double width;
    private double length;
    private double height;
    private double price;

    public Square(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Square(double width, double length, double height, double price) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.price = price;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
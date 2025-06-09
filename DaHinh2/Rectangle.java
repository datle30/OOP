import java.text.DecimalFormat;
import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /**
     * Rectangle.
     */
    public Rectangle() {}

    /**
     * Retangle().
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Retangle(full).
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Rectangle(full+).
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    /**
     * Getter and Setter.
     */
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

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * getArea.
     */
    public double getArea() {
        return this.width * this.length;
    }

    /**
     * getPerimeter.
     */
    public double getPerimeter() {
        return this.width * 2 + this.length * 2;
    }

    /**
     * toString.
     */
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.0"); // Định dạng để làm tròn đến 1 chữ số thập phân
        return "Rectangle[topLeft=" + topLeft + ",width=" + df.format(width)
                + ",length=" + df.format(length) + ",color=" + color + ",filled=" + filled + "]";
    }

    /**
     * equals.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return topLeft.equals(other.topLeft) && Math.abs(width - other.width) < 0.001
                    && Math.abs(length - other.length) < 0.001;
        }
        return false;
    }

    /**
     * hashCode.
     */
    public int hashCode() {
        int result = 1;
        result = 31 * result + Double.hashCode(width);
        result = 31 * result + Double.hashCode(length);
        result = 31 * result + Objects.hashCode(color);
        result = 31 * result + Objects.hashCode(topLeft);
        result = 31 * result + Boolean.hashCode(filled);
        return result;
    }
}

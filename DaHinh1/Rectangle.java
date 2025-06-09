public class Rectangle extends Shape {
    protected double width;
    protected double length;

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
        return "Rectangle[width=" + this.width + ",length="
                + this.length + ",color=" + this.color + ",filled=" + this.filled + "]";
    }
}

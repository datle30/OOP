public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Shape.
     */
    public Shape() {}

    /**
     * Shape().
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Getter and Setter.
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * getArea.
     */
    public abstract double getArea();

    /**
     * getPerimeter.
     */
    public abstract double getPerimeter();

    /**
     * toString.
     */
    public String toString() {
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    }
}

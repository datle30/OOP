public class Circle extends Shape {
    protected double radius;

    /**
     * Circle.
     */
    public Circle() {
    }

    /**
     * Circle().
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Circle(double,string).
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Getter and setter.
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * getArea.
     */
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * getPerimeter.
     */
    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    /**
     * toStirng.
     */
    public String toString() {
        return "Circle[radius=" + this.radius + ",color="
                + this.color + ",filled=" + this.filled + "]";
    }
}

import java.text.DecimalFormat;
import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

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
     * Circle(full).
     */
    public Circle(Point center, double radius,
                  String color, boolean filled) {
        super(color, filled);
        this.center = center;
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

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
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
        DecimalFormat df = new DecimalFormat("#.0"); // Định dạng để làm tròn đến 1 chữ số thập phân
        return "Circle[center=" + center + ",radius="
                + df.format(radius) + ",color=" + color + ",filled=" + filled + "]";
    }

    /**
     * equals.
     */
    public boolean equals(Object o) {
        // Kiểm tra xem o có phải là một Circle không
        if (o instanceof Circle) {
            Circle other = (Circle) o;
            if (Math.abs(this.radius - other.radius) <= 0.001
                    && Objects.equals(this.color, other.color)) {
                        return true;
            }
        }
        return false;
    }

    /**
     * hashCode.
     */
    public int hashCode() {
        int result = 1;
        result = 31 * result + Double.hashCode(radius);
        result = 31 * result + Objects.hashCode(color);
        result = 31 * result + Objects.hashCode(center);
        result = 31 * result + Boolean.hashCode(filled);
        return result;
    }
}

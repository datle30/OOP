public class Circle {
    private double radius;
    private String color;
    protected static final double PI = Math.PI;
    
    /**
     * Circle().
     */
    public Circle() {
    }

    /**
     * Circle(double).
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Circle(double, string).
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Getter and Setter.
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Area.
     */
    public double getArea() {
        return this.radius * this.radius * PI;
    }

    /**
     * toString.
     */
    public String toString() {
        return "Circle[radius=" + radius + " ,color=" + color + "]";
    }
}

public class Cylinder extends Circle {
    private double height;

    /**
     * Cylinder().
     */
    public Cylinder() {
    }

    /**
     * Cylinder(double).
     */
    public Cylinder(double height) {
        this.height = height;
    }

    /**
     * Cylinder(double, double).
     */
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    /**
     * Cylinder(double, doule, String).
     */
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Getter and Setter.
     */
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Volume.
     */
    public double getVolume() {
        return super.getArea() * height;
    }

    /**
     * Area.
     */
    public double getArea() {
        return 2 * PI * super.getRadius() * height + 2 * super.getArea();
    }

    /**
     * toString.
     */
    public String toString() {
        return "Cylinder[Circle[radius=" + getRadius() + " ,color="
                + getColor() + "],height=" + height;
    }
}

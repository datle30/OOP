import java.text.DecimalFormat;
import java.util.Objects;

public class Square extends Rectangle {

    /**
     * Square.
     */
    public Square() {}

    /**
     * Square().
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Square(full).
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Square(full+).
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * Getter and Setter.
     */
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    /**
     * toString.
     */
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.0"); // Định dạng để làm tròn đến 1 chữ số thập phân
        return "Square[topLeft=" + topLeft + ",side=" + df.format(getSide())
                + ",color=" + color + ",filled=" + filled + "]";
    }

    /**
     * equals.
     */
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square other = (Square) o;
            if ((Math.abs(this.getSide() - other.getSide()) <= 0.001)
                    && Objects.equals(this.color, other.color)
                    && Objects.equals(topLeft, other.topLeft)) {
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
        result = 31 * result + Double.hashCode(getSide());
        result = 31 * result + Objects.hashCode(color);
        result = 31 * result + Boolean.hashCode(filled);
        result = 31 * result + Objects.hashCode(topLeft);
        return result;
    }
}

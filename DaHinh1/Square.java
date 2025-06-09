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
        return "Square[side=" + getSide()
                + ",color=" + this.color + ",filled=" + this.filled + "]";
    }
}

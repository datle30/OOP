public class Point {
    private double pointX;
    private double pointY;

    /**
     * Point.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Getter and Setter.
     */
    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance.
     */
    public double distance(Point newPoint) {
        double dx = this.pointX - newPoint.getPointX();
        double dy = this.pointY - newPoint.getPointY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * equals.
     */
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point other = (Point) o;
            if (this.pointX == other.pointX
                    && this.pointY == other.pointY) {
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
        result = 31 * result + Double.hashCode(pointX);
        result = 31 * result + Double.hashCode(pointY);
        return result;
    }

    /**
     * toString.
     */
    public String toString() {
        return "(" + this.pointX + "," + this.pointY + ")";
    }
}

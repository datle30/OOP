public class Numeral extends Expression {
    private double value;

    /**
     * Numeral.
     */
    public Numeral() {

    }

    /**
     * Numeral().
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * toString.
     */
    public String toString() {
        return "" + (int) value;
    }

    /**
     * evaluate.
     */
    public double evaluate() {
        return value;
    }
}

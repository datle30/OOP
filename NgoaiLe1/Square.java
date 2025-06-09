public class Square extends Expression {
    private Expression expression;

    /**
     * Square.
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * toString.
     */
    public String toString() {
        return "(" + expression.toString() + ") ^ 2";
    }

    /**
     * evaluate.
     */
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}

public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * BinaryExpression.
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * toString.
     */
    public abstract String toString();

    /**
     * evaluate.
     */
    public abstract double evaluate();
}

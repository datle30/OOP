public class Division extends BinaryExpression {
    /**
     * Division.
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * toString.
     */
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }

    /**
     * evaluate.
     */
    @Override
    public double evaluate() throws ArithmeticException {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        return left.evaluate() / right.evaluate();
    }
}

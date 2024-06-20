public class Mult extends BinaryOperation {
    public Mult(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int value() {
        return left().value() * right().value();
    }

    @Override
    public void accept(ExpressionVisitor ev){
        ev.visit(this);
    }

}

import java.util.HashSet;
import java.util.Set;

public abstract class BinaryOperation implements  Expression{
    private final Expression left;
    private final Expression right;

    public BinaryOperation(Expression left, Expression right) {
        if(left == null || right == null) throw new NullPointerException("");
        this.left = left;
        this.right = right;
    }

    Expression left(){
        return left;
    }

    Expression right(){
        return right;
    }

    @Override
    public boolean isValid(Set<Expression> visitats) {
        return visitats.add(this) && left.isValid(visitats) & right.isValid(visitats) ;
    }

    public abstract int value();



}

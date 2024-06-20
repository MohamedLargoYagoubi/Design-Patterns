import java.util.HashSet;
import java.util.Set;

public class ValidVisitor implements ExpressionVisitor{
    private final Set<Expression> visitats;

    public ValidVisitor(Set<Expression> visitats) {
        this.visitats = visitats;
    }

    public static boolean isValid(Expression e, Set<Expression> visitats){
        //TODO
        return true;
    }


    @Override
    public void visit(Constant c) {

    }

    @Override
    public void visit(Mult m) {

    }

    @Override
    public void visit(Sum s) {

    }
}

import java.util.Set;

public class Constant implements Expression{
    int value;

    public Constant(int value){
        this.value = value;
    }
    @Override
    public boolean isValid(Set<Expression> visitats) {
        // .add() -> True si no està a la llista
        // .add() -> False si està a la llista
        return visitats.add(this);
    }

    @Override
    public int value(){
        return value;
    }

    @Override
    public void accept(ExpressionVisitor ev){
        ev.visit(this);
    }

}

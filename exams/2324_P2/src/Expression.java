import java.util.HashSet;
import java.util.Set;

public interface Expression {
    boolean isValid(Set<Expression> visitats);

    default boolean isValid(){
        return isValid(new HashSet<>());
    }

    int value();

    void accept(ExpressionVisitor visitor);

}

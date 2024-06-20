public interface ExpressionVisitor {
    void visit(Constant c);
    void visit(Mult m);
    void visit(Sum s);
}

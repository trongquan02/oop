package lab14.visitor.book;

public interface Visitor {
    void visit(BussinesBook book);

    void visit(DesignPatternBook book);

    void visit(JavaCoreBook book);
}

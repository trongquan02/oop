package lab14.visitor.computer;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}

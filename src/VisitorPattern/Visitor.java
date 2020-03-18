package VisitorPattern;

public interface Visitor {
	public void visit(House house);
	public void visit(Office office);
}

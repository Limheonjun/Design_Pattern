package VisitorPattern;

public class House implements Visitable {
	private String name = "°¡Á¤Áý";
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}

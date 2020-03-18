package VisitorPattern;

public class Office implements Visitable{
	private String name = "�繫��";
	
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

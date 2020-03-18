package VisitorPattern;

public class Office implements Visitable{
	private String name = "»ç¹«½Ç";
	
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

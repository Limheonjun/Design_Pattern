package DecoratorPattern;

public class Tree extends Object {
	public Tree(Picture picture) {
		super(picture);
	}
	
	@Override
	public String getName() {
		return " ³ª¹«"+picture.getName();
	}
}

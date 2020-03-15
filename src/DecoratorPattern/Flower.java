package DecoratorPattern;

public class Flower extends Object {
	public Flower(Picture picture) {
		super(picture);
	}
	
	@Override
	public String getName() {
		return " ²É"+picture.getName();
	}
}

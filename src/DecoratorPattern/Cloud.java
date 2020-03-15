package DecoratorPattern;

public class Cloud extends Object {
	public Cloud(Picture picture) {
		super(picture);
	}
	
	@Override
	public String getName() {
		return " ±¸¸§"+picture.getName();
	}
}

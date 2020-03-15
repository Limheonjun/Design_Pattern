package DecoratorPattern;

public abstract class Object implements Picture {
	protected Picture picture;
	
	public Object(Picture picture) {
		this.picture = picture;
	}
	
	@Override
	public abstract String getName();
}

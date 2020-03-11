package AbstractFactoryPattern;

public class WinterFood implements Food{
	@Override
	public void eat() {
		System.out.println("따뜻한 음식 준비");
	}
}

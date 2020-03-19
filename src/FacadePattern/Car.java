package FacadePattern;

public class Car {
	private final Engine engine;
	private final Skeleton skeleton;
	private final Wheel wheel;
	
	public Car() {
		engine = new Engine();
		skeleton = new Skeleton();
		wheel = new Wheel();
	}
	
	public void makeCar() {
		skeleton.makeSkeleton();
		engine.installEngine();
		wheel.equipWheel();
	}
	
}

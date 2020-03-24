package StatePattern;

public class Person {
	private State state;
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void getUP() {
		state.getUp(this);
	}
	
	public void sitDown() {
		state.sitDown(this);
	}
}

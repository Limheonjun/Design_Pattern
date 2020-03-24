package StatePattern;

public class StandingPerson implements State{
	
	@Override
	public void getUp(Person person) {
		System.out.println("이미 일어서있습니다");
		person.setState(this);
	}
	
	@Override
	public void sitDown(Person person) {
		System.out.println("앉았습니다");
		person.setState(this);
	}
}

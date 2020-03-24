package StatePattern;

public class SittingPerson implements State{
	
	@Override
	public void getUp(Person person) {
		System.out.println("일어났습니다");
		person.setState(this);
	}
	
	@Override
	public void sitDown(Person person) {
		System.out.println("이미 앉아있습니다");
		person.setState(this);
	}
}

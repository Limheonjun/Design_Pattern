package StatePattern;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.setState(new SittingPerson());
		
		person.sitDown();
		person.getUP();
		
		person.setState(new StandingPerson());
		
		person.getUP();
		person.sitDown();
	}
}

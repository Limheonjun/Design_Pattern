package StatePattern;

public class StandingPerson implements State{
	
	@Override
	public void getUp(Person person) {
		System.out.println("�̹� �Ͼ�ֽ��ϴ�");
		person.setState(this);
	}
	
	@Override
	public void sitDown(Person person) {
		System.out.println("�ɾҽ��ϴ�");
		person.setState(this);
	}
}

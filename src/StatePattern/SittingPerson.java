package StatePattern;

public class SittingPerson implements State{
	
	@Override
	public void getUp(Person person) {
		System.out.println("�Ͼ���ϴ�");
		person.setState(this);
	}
	
	@Override
	public void sitDown(Person person) {
		System.out.println("�̹� �ɾ��ֽ��ϴ�");
		person.setState(this);
	}
}

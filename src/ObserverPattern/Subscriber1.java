package ObserverPattern;

public class Subscriber1 implements Observer{
	
	private Subject publisher;
	
	public Subscriber1(Subject publisher) {
		this.publisher = publisher;
		publisher.add(this, "������1");
	}
	
	@Override
	public void update() {
		System.out.println("���ο� �Ź��� ������ 1���� �����߽��ϴ�.");
	}
	
	public void unsubscribe() {
		publisher.delete(this, "������1");
	}
}

package ObserverPattern;

public class Subscriber2 implements Observer{
	
	private Subject publisher;
	
	public Subscriber2(Subject publisher) {
		this.publisher = publisher;
		publisher.add(this, "������2");
	}
	
	@Override
	public void update() {
		System.out.println("���ο� �Ź��� ������ 2���� �����߽��ϴ�.");
	}
	
	public void unsubscribe() {
		publisher.delete(this, "������2");
	}
}

package ObserverPattern;

public class Subscriber3 implements Observer {
	
	private Subject publisher;
	
	public Subscriber3(Subject publisher) {
		this.publisher = publisher;
		publisher.add(this, "������3");
	}
	
	@Override
	public void update() {
		System.out.println("���ο� �Ź��� ������ 3���� �����߽��ϴ�.");
	}
	
	public void unsubscribe() {
		publisher.delete(this, "������3");
	}
}

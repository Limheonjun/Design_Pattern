package ObserverPattern;

public class Subscriber1 implements Observer{
	
	private Subject publisher;
	
	public Subscriber1(Subject publisher) {
		this.publisher = publisher;
		publisher.add(this, "구독자1");
	}
	
	@Override
	public void update() {
		System.out.println("새로운 신문이 구독자 1에게 도착했습니다.");
	}
	
	public void unsubscribe() {
		publisher.delete(this, "구독자1");
	}
}

package ObserverPattern;

public class Main {
	public static void main(String[] args) {
		NewspaperPublisher newspaperPublisher = new NewspaperPublisher();
		
		Subscriber1 subscriber1 = new Subscriber1(newspaperPublisher);
		Subscriber2 subscriber2 = new Subscriber2(newspaperPublisher);
		Subscriber3 subscriber3 = new Subscriber3(newspaperPublisher);
		
		System.out.println("============신문 발행===========");
		
		newspaperPublisher.publish();
		
		System.out.println("==========구독자2 구독취소=======");
		
		subscriber2.unsubscribe();
		
		System.out.println("============신문 발행===========");
		
		newspaperPublisher.publish();
		
	}
}

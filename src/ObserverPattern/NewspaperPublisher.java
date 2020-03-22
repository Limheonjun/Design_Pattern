package ObserverPattern;

import java.util.ArrayList;

public class NewspaperPublisher implements Subject {

	private ArrayList<Observer> observers;
	
	public NewspaperPublisher() {
		observers = new ArrayList<Observer>();
	}
	
	public void publish() {
		System.out.println("신문을 발행하였습니다.");
		notifyObservers();
	}
	
	@Override
	public void add(Observer observer, String s) {
		System.out.println(s+"이 신문을 구독했습니다.");
		observers.add(observer);
	}
	
	@Override
	public void delete(Observer observer, String s) {
		System.out.println(s+"이 구독을 해지했습니다.");
		observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		for(Observer observer : observers)
			observer.update();
		
	}
}

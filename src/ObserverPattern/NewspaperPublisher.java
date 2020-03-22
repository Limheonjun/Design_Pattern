package ObserverPattern;

import java.util.ArrayList;

public class NewspaperPublisher implements Subject {

	private ArrayList<Observer> observers;
	
	public NewspaperPublisher() {
		observers = new ArrayList<Observer>();
	}
	
	public void publish() {
		System.out.println("�Ź��� �����Ͽ����ϴ�.");
		notifyObservers();
	}
	
	@Override
	public void add(Observer observer, String s) {
		System.out.println(s+"�� �Ź��� �����߽��ϴ�.");
		observers.add(observer);
	}
	
	@Override
	public void delete(Observer observer, String s) {
		System.out.println(s+"�� ������ �����߽��ϴ�.");
		observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		for(Observer observer : observers)
			observer.update();
		
	}
}

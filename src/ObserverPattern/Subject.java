package ObserverPattern;

public interface Subject {
	public void add(Observer observer, String s);
	public void delete(Observer observer, String s);
	public void notifyObservers();
}

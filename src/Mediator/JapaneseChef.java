package Mediator;

public class JapaneseChef implements Cook{
	private Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void makeFood(String food) {
		mediator.deliverFood("ÀÏ½Ä", food);
	}
	
}

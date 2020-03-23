package Mediator;

public class ChineseChef implements Cook{
	private Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void makeFood(String food) {
		mediator.deliverFood("Áß½Ä", food);
	}
	
}

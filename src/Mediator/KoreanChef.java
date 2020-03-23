package Mediator;

public class KoreanChef implements Cook{
	private Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void makeFood(String food) {
		mediator.deliverFood("ÇÑ½Ä", food);
	}
	
}

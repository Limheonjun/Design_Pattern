package Mediator;

public class Office implements Customer{
	@Override
	public void receiveFood(String chef, String food) {
		System.out.println("사무실 근무자가 "+chef+"요리사의 "+food+"을(를) 배달받았습니다");
	}
}

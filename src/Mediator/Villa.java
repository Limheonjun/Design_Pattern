package Mediator;

public class Villa implements Customer{
	@Override
	public void receiveFood(String chef, String food) {
		System.out.println("빌라 거주자가 "+chef+"요리사의 "+food+"을(를) 배달받았습니다");
	}
}

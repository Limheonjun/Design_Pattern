package Mediator;

public class Apartment implements Customer{
	@Override
	public void receiveFood(String chef, String food) {
		System.out.println("����Ʈ �����ڰ� "+chef+"�丮���� "+food+"��(��) ��޹޾ҽ��ϴ�");
	}
}

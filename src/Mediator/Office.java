package Mediator;

public class Office implements Customer{
	@Override
	public void receiveFood(String chef, String food) {
		System.out.println("�繫�� �ٹ��ڰ� "+chef+"�丮���� "+food+"��(��) ��޹޾ҽ��ϴ�");
	}
}

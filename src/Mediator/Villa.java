package Mediator;

public class Villa implements Customer{
	@Override
	public void receiveFood(String chef, String food) {
		System.out.println("���� �����ڰ� "+chef+"�丮���� "+food+"��(��) ��޹޾ҽ��ϴ�");
	}
}

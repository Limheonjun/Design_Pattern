package BridgePattern;

public class Apartment extends House {
	
	public Apartment(Making making) {
		super(making);
	}
	
	@Override
	public void make() {
		System.out.println("�� �ǹ��� ����Ʈ �Դϴ�");
	}

}

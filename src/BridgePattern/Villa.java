package BridgePattern;

public class Villa extends House {
	
	public Villa(Making making) {
		super(making);
	}
	
	@Override
	public void make() {
		System.out.println("�� �ǹ��� ���� �Դϴ�");
	}

}

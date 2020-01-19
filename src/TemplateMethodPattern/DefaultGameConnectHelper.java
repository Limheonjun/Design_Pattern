package TemplateMethodPattern;

public class DefaultGameConnectHelper extends GameConnectHelper{

	@Override
	protected String doSecurity(String string) {
		
		// Before
		// System.out.println("Decoding");
		// After
		System.out.println("Enhanced decoding");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("Check id & pw");
		return false;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("Check authorization");
		// �����̸��� ���� ������ ���̸� �� �� ����
		// ������ �ƴϰ� 10�ð� �����ٸ�
		int age = 20;
		if(age<20) return -1;
		else return 1;
	}

	@Override
	protected String connection(String info) {
		System.out.println("Last access phase");
		return null;
	}

}

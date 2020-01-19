package TemplateMethodPattern;

public abstract class GameConnectHelper {
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	public String requestConnection(String encodedInfo) {
		
		// ����(decoding)
		String decodedInfo = doSecurity(encodedInfo);
		
		// ��ȯ�� ���� ���� ���̵�� ��ȣ �Ҵ�
		String id = "aaa";
		String password = "bbb";
		
		// ����
		if(authentication(id, password)) {
			throw new Error("id & pw not matched");
		}
		
		String userName = "userName";
		int i = authorization(userName);
		switch(i) {
		case -1:
			throw new Error("Shut Down");
		case 0: // Game Manager
			System.out.println("Game Manager");
			break;
		case 1: // Paid Member
			System.out.println("Paid Member");
			break;
		case 2: // Free Member
			System.out.println("Free Member");
			break;
		case 3: // No Permission
			System.out.println("No permission");
			break;
		default: // Etc
			break;
		}
		
		return connection(decodedInfo);
	}
}

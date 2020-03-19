package ChainOfResponsibilityPattern;

public abstract class Exception {
	static Exception[] exceptions = {
			new ClassNotFoundException(), 
			new IOException(), 
			new NullPointException(),
			new RuntimeException()};
	public static int num = 0;
	public static final int max = 3;
	public static Exception exception;
	
	public static Exception findError(Exception exception) {
		return next(exception);
	}
	
	public static Exception next(Exception e) {
		exception = e;
		
		if(num>max) {
			System.out.println("�ش� ������ �´� Ÿ���� �������� �ʽ��ϴ�");
			return null;
		}
		
		return exceptions[num++].check();
					
	}
	
	public abstract Exception check();
}

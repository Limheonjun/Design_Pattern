package FactoryMethod;

public abstract class ItemCreator {
	// ���丮 �޼ҵ� ���� -> ���ø� �޼ҵ尡 ����
	public Item create() {
		Item item;
		
		// 1�ܰ�
		requestItemsInfo();
		// 2�ܰ�
		item = createItem();
		// 3�ܰ�
		createItemLog();
		return item;
	}
	
	/* 
		�߿��� ������ ��������
		�ٸ���Ű�� �������� �ǵ帱 �� ���� �����
		���� ��Ű�� Ȥ�� ��ӹ��� Ŭ����������
		���۰����ϵ��� protected�� ����
	*/
	// ������ ���� �� DB�� ������ ������ ��û
	abstract protected void requestItemsInfo();
	// ������ ���� �� ������ ���� ���� �����ϱ� ���� DB�� ������ ����
	abstract protected void createItemLog();
	// �������� ����
	abstract protected Item createItem();
}

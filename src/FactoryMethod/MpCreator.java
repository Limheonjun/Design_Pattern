package FactoryMethod;

import java.util.Date;

public class MpCreator extends ItemCreator{

	protected void requestItemsInfo() {
		System.out.println("DB���� ���� ������ ������ �����ɴϴ�");
	}
	
	protected void createItemLog() {
		System.out.println("���� ������ ���� ���� �߽��ϴ�"+new Date());	
	}

	protected Item createItem() {
		return new MpPotion();
	}

}

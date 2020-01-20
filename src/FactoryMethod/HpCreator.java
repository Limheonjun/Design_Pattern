package FactoryMethod;

import java.util.Date;

public class HpCreator extends ItemCreator{

	protected void requestItemsInfo() {
		System.out.println("DB���� ü�� ������ ������ �����ɴϴ�");
	}
	
	protected void createItemLog() {
		System.out.println("���� ������ ���� ���� �߽��ϴ�"+new Date());	
	}

	protected Item createItem() {
		return new HpPotion();
	}

}

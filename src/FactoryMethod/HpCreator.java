package FactoryMethod;

import java.util.Date;

public class HpCreator extends ItemCreator{

	protected void requestItemsInfo() {
		System.out.println("DB에서 체력 물약의 정보를 가져옵니다");
	}
	
	protected void createItemLog() {
		System.out.println("마력 물약을 새로 생성 했습니다"+new Date());	
	}

	protected Item createItem() {
		return new HpPotion();
	}

}

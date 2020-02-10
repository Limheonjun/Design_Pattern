package FactoryMethod;

public class EquipItem implements Item{
	@Override
	public void use() {
		System.out.println("아이템을 장착했습니다");
	}
}

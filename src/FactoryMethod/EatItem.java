package FactoryMethod;

public class EatItem implements Item{
	@Override
	public void use() {
		System.out.println("아이템을 먹었습니다");
	}
}

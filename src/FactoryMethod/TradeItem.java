package FactoryMethod;

public class TradeItem implements Item{
	@Override
	public void use() {
		System.out.println("아이템을 교환했습니다");
	}
}

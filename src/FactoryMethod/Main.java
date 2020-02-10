package FactoryMethod;

public class Main {
	
	public static void main(String[] args) {
		ItemUseFactory itemUseFactory = new ItemUseFactoryImpl();
		Item item;
		
		item = itemUseFactory.useItem("EatItem");
		item.use();
		
		item = itemUseFactory.useItem("EquipItem");
		item.use();
		
		item = itemUseFactory.useItem("TradeItem");
		item.use();
	}
}

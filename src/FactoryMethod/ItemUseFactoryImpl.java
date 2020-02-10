package FactoryMethod;

public class ItemUseFactoryImpl implements ItemUseFactory{
	@Override
	public Item useItem(String item) {
		switch(item) {
			case "EatItem": return new EatItem();
			case "EquipItem": return new EquipItem();
			case "TradeItem": return new TradeItem();
			default: return null;
		}
	}
}

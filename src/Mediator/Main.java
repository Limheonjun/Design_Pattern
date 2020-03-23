package Mediator;

public class Main {
	public static void main(String[] args) {
		Mediator deliveryMan = new Mediator();
		
		JapaneseChef jChef = new JapaneseChef();
		ChineseChef cChef = new ChineseChef();
		KoreanChef kChef = new KoreanChef();
		
		jChef.setMediator(deliveryMan);
		cChef.setMediator(deliveryMan);
		kChef.setMediator(deliveryMan);
		
		deliveryMan.addCustomer(new Office());
		deliveryMan.addCustomer(new Apartment());
		deliveryMan.addCustomer(new Villa());
		
		jChef.makeFood("ÃÊ¹ä");
		kChef.makeFood("²ã¹Ù·Î¿ì");
		
		
	}
}

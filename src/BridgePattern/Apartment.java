package BridgePattern;

public class Apartment extends House {
	
	public Apartment(Making making) {
		super(making);
	}
	
	@Override
	public void make() {
		System.out.println("이 건물은 아파트 입니다");
	}

}

package FactoryMethod;

public abstract class ItemCreator {
	// 팩토리 메소드 패턴 -> 템플릿 메소드가 사용됨
	public Item create() {
		Item item;
		
		// 1단계
		requestItemsInfo();
		// 2단계
		item = createItem();
		// 3단계
		createItemLog();
		return item;
	}
	
	/* 
		중요한 정보인 아이템은
		다른패키지 내에서는 건드릴 수 없게 만들고
		같은 패키지 혹은 상속받은 클래스에서만
		조작가능하도록 protected로 설정
	*/
	// 아이템 생성 전 DB에 아이템 정보를 요청
	abstract protected void requestItemsInfo();
	// 아이템 생성 후 아이템 복제 등을 방지하기 위해 DB에 아이템 생성
	abstract protected void createItemLog();
	// 아이템을 생성
	abstract protected Item createItem();
}

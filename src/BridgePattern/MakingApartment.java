package BridgePattern;

public class MakingApartment implements Making{
	@Override
	public void buildSkeleton() {
		System.out.println("아파트 뼈대 짓기");
	}
	@Override
	public void cementWall() {
		System.out.println("아파트 벽에 시멘트 바르기");
	}
}

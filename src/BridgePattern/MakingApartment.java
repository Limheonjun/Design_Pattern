package BridgePattern;

public class MakingApartment implements Making{
	@Override
	public void buildSkeleton() {
		System.out.println("����Ʈ ���� ����");
	}
	@Override
	public void cementWall() {
		System.out.println("����Ʈ ���� �ø�Ʈ �ٸ���");
	}
}

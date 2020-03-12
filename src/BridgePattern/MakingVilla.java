package BridgePattern;

public class MakingVilla implements Making{
	@Override
	public void buildSkeleton() {
		System.out.println("ºô¶ó »À´ë Áþ±â");
	}
	@Override
	public void cementWall() {
		System.out.println("ºô¶ó º®¿¡ ½Ã¸àÆ® ¹Ù¸£±â");
	}
}

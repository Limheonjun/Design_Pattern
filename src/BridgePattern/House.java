package BridgePattern;

public abstract class House {

	private Making making;
	
	public House(Making making) {
		this.making = making;
	}
	
	public void buildSkeleton() {
		making.buildSkeleton();
	}
	
	public void cementWall() {
		making.cementWall();
	}
	
	public abstract void make();

}

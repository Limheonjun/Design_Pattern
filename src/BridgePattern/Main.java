package BridgePattern;

public class Main {
	public static void main(String[] args) {
		House apartment = new Apartment(new MakingApartment());
		House villa = new Villa(new MakingVilla());
		
		apartment.buildSkeleton();
		apartment.cementWall();
		apartment.make();
		
		villa.buildSkeleton();
		villa.cementWall();
		villa.make();
	}
}

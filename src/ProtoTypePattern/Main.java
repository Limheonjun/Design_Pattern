package ProtoTypePattern;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Programming programming1 = new Programming();
		programming1.setOs("Window10");
		programming1.setNetwork("LAN");
		programming1.setDb("Mysql");
		
		System.out.println("-----programming1-----");
		System.out.println(programming1.getOs());
		System.out.println(programming1.getNetwork());
		System.out.println(programming1.getDb());
		
		Programming programming2 = programming1.copy();
		System.out.println("-----Programming programming2 = programming1.copy()-----");
		System.out.println("-----Change programming2-----");
		programming2.setOs("Window8.1");
		programming2.setNetwork("WAN");
		programming2.setDb("Mssql");
		
		System.out.println("-----programming1-----");
		System.out.println(programming1.getOs());
		System.out.println(programming1.getNetwork());
		System.out.println(programming1.getDb());
		
		System.out.println("-----programming2-----");
		System.out.println(programming2.getOs());
		System.out.println(programming2.getNetwork());
		System.out.println(programming2.getDb());
		

		System.out.println("-----Programming programming3 = programming1-----");
		Programming programming3 = programming1;
		System.out.println("-----Change programming3-----");
		programming3.setOs("Linux");
		programming3.setNetwork("MAN");
		programming3.setDb("MongoDb");
		
		System.out.println("-----programming1-----");
		System.out.println(programming1.getOs());
		System.out.println(programming1.getNetwork());
		System.out.println(programming1.getDb());
		
		System.out.println("-----programming3-----");
		System.out.println(programming3.getOs());
		System.out.println(programming3.getNetwork());
		System.out.println(programming3.getDb());
		

		
		
		
	}

}

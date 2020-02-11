package ProtoTypePattern;

public class Programming implements Cloneable{
	private String os;
	private String network;
	private String db;
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getDb() {
		return db;
	}
	public void setDb(String db) {
		this.db = db;
	}
	
	public Programming copy() throws CloneNotSupportedException {
		Programming programming = (Programming) clone();
		return programming;
	}
}

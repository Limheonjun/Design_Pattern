package TemplateMethodPattern;

public class Main {
	public static void main(String[] args) {
		GameConnectHelper helper = new DefaultGameConnectHelper();
		
		helper.requestConnection("login Info");
	}
}
 
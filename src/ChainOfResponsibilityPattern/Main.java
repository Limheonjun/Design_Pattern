package ChainOfResponsibilityPattern;

public class Main {
	public static void main(String[] args) {
		System.out.println("=====Error occured=====");
		Exception.findError(new RuntimeException());
		Exception.findError(new IOException());
		Exception.findError(new ABCException());
	}
}

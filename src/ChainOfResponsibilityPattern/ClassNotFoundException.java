package ChainOfResponsibilityPattern;

public class ClassNotFoundException extends Exception {
	@Override
	public Exception check() {
		if(this.getClass().getName().equals(exception.getClass().getName())) {
			num = 0;
			System.out.println("ClassNotFoundException Occured");
			return this;
		}
		return next(exception);
	}
}

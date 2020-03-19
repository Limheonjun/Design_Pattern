package ChainOfResponsibilityPattern;

public class RuntimeException extends Exception {
	@Override
	public Exception check() {
		if(this.getClass().getName().equals(exception.getClass().getName())) {
			num = 0;
			System.out.println("RuntimeException Occured");
			return this;
		}
		return next(exception);
	}
}

package ChainOfResponsibilityPattern;

public class IOException extends Exception {
	@Override
	public Exception check() {
		if(this.getClass().getName().equals(exception.getClass().getName())) {
			num = 0;
			System.out.println("IOException Occured");
			return this;
		}
		return next(exception);
	}
}

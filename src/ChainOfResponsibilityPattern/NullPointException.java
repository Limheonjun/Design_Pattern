package ChainOfResponsibilityPattern;

public class NullPointException extends Exception {
	@Override
	public Exception check() {
		if(this.getClass().getName().equals(exception.getClass().getName())) {
			num = 0;
			System.out.println("NullPointException Occured");
			return this;
		}
		return next(exception);
	}
}

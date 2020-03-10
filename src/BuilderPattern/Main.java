package BuilderPattern;

public class Main {

	public static void main(String[] args) {
		
		Computer computer = new ComputerBuilder()
				.cpu("i7")
				.ram("64g")
				.storage("1TB SSD")
				.build();
		
		computer.printSpec();
		
	}
	
}

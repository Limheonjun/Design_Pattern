package BuilderPattern;

public class ComputerBuilder {
	
	private String cpu;
	private String ram;
	private String storage;
	
	public ComputerBuilder cpu(String cpu) {
		this.cpu=cpu;
		return this;
	}
	
	public ComputerBuilder ram(String ram) {
		this.ram=ram;
		return this;
	}
	
	public ComputerBuilder storage(String storage) {
		this.storage=storage;
		return this;
	}	
	
	public Computer build() {
		Computer computer = new Computer(cpu, ram, storage);
		return computer;
	}
}

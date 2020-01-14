package StrategyPattern;

public class CafeStudyStrategy implements StudyStrategy {
	@Override
	public void study() {
		System.out.println("Study at Cafe");
	}
}

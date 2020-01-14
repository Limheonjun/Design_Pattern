package StrategyPattern;

public class HomeStudyStrategy implements StudyStrategy {
	@Override
	public void study() {
		System.out.println("Study at Home");
	}
}
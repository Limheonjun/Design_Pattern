package StrategyPattern;

public class LibraryStudyStrategy implements StudyStrategy {
	@Override
	public void study() {
		System.out.println("Study at library");
	}
}
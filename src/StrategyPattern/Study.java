package StrategyPattern;

public class Study {
	private StudyStrategy studyStrategy;
	
	public Study() {}
	
	public Study(StudyStrategy studyStrategy) {
		this.studyStrategy = studyStrategy;
	}
	
	public void setStrategy(StudyStrategy studyStrategy) {
		this.studyStrategy = studyStrategy;
	}
	
	public void doStudy() {
		studyStrategy.study();
	}
}

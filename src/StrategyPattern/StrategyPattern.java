package StrategyPattern;

public class StrategyPattern {
	 public static void main(String[] args) {
		 Study study = new Study();
		 
		 study.setStrategy(new HomeStudyStrategy());
		 study.doStudy();
		 
		 study.setStrategy(new CafeStudyStrategy());
		 study.doStudy();
		 
		 study.setStrategy(new LibraryStudyStrategy());
		 study.doStudy();
	}
}

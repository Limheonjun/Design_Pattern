package AbstractFactoryPattern;

public class Main {

	public static void main(String[] args) {
		SeasonPlanFactory seasonPlanFactory;
		
		System.out.println("겨울 준비 계획");
		seasonPlanFactory = new WinterPlan();
		seasonPlanFactory.prepareClothes().wear();
		seasonPlanFactory.prepareFood().eat();
		
		System.out.println();
		
		System.out.println("여름 준비 계획");
		seasonPlanFactory = new SummerPlan();
		seasonPlanFactory.prepareClothes().wear();
		seasonPlanFactory.prepareFood().eat();
	}

}

package AbstractFactoryPattern;

public class Main {

	public static void main(String[] args) {
		SeasonPlanFactory seasonPlanFactory;
		
		System.out.println("�ܿ� �غ� ��ȹ");
		seasonPlanFactory = new WinterPlan();
		seasonPlanFactory.prepareClothes().wear();
		seasonPlanFactory.prepareFood().eat();
		
		System.out.println();
		
		System.out.println("���� �غ� ��ȹ");
		seasonPlanFactory = new SummerPlan();
		seasonPlanFactory.prepareClothes().wear();
		seasonPlanFactory.prepareFood().eat();
	}

}

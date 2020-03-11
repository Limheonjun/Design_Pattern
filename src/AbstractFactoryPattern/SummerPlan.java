package AbstractFactoryPattern;

public class SummerPlan implements SeasonPlanFactory{
	@Override
	public Clothes prepareClothes() {
		return new SummerClothes();
	}
	@Override
	public Food prepareFood() {
		return new SummerFood();
	}
}

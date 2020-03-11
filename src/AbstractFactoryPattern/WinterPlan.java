package AbstractFactoryPattern;

public class WinterPlan implements SeasonPlanFactory{
	@Override
	public Clothes prepareClothes() {
		return new WinterClothes();
	}
	@Override
	public Food prepareFood() {
		return new WinterFood();
	}
}

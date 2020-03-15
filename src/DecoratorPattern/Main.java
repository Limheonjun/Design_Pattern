package DecoratorPattern;

public class Main {
	public static void main(String[] args) {
		Picture whiteBP = new WhiteBackgroundPicture();
		System.out.println(whiteBP.getName());
		
		
		Picture treeWhiteBP = new Tree(whiteBP);
		Picture flowerTreeWhiteBP = new Flower(treeWhiteBP);
		Picture cloudFlowerTreeWhiteBP = new Cloud(flowerTreeWhiteBP);
		System.out.println(cloudFlowerTreeWhiteBP.getName());
		
		
		Picture blueBP = new BlueBackgroundPicture();
		Picture flowerCloudTreeBlueBP = new Flower(new Cloud(new Tree(new BlueBackgroundPicture())));
		System.out.println(flowerCloudTreeBlueBP.getName());
	}
}

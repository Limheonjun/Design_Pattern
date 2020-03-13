package CompositePattern;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		Stuff book = new Stuff("å");
		Stuff ball = new Stuff("��");
		Stuff pen = new Stuff("��");
		Stuff mp3 = new Stuff("mp3");
		Stuff phone = new Stuff("����Ʈ��");
		
		Box hugePlasticBox = new Box("�Ŵ��� �ö�ƽ �ڽ�");
		Box bigPaperBox = new Box("ū ���� �ڽ�");
		Box mediumPlasticBox = new Box("�߰�ũ�� �ö�ƽ �ڽ�");
		Box smallPaperBox = new Box("���� ���� �ڽ�");
		
		smallPaperBox.add(book);
		smallPaperBox.add(pen);
		
		mediumPlasticBox.add(phone);
		mediumPlasticBox.add(smallPaperBox);
		
		bigPaperBox.add(pen);
		bigPaperBox.add(mediumPlasticBox);
		
		hugePlasticBox.add(ball);
		hugePlasticBox.add(bigPaperBox);
		
		
		// hugePlasticBox �Ʒ� �ִ� ���� ��� ���
		List<Component> temp = hugePlasticBox.components;
		int tempSize = temp.size();
		System.out.println(hugePlasticBox.name);
		String s = "     ";
		for(int i=0; i<tempSize; i++) {
			System.out.println(s+temp.get(i).name);
			if(temp.get(i) instanceof Box) {
				temp = ((Box) temp.get(i)).components;
				tempSize = temp.size();
				i=-1;
				s+=s;
			}
			
		}
		
	}
}

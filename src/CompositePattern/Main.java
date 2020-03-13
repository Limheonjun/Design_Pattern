package CompositePattern;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		Stuff book = new Stuff("책");
		Stuff ball = new Stuff("공");
		Stuff pen = new Stuff("펜");
		Stuff mp3 = new Stuff("mp3");
		Stuff phone = new Stuff("스마트폰");
		
		Box hugePlasticBox = new Box("거대한 플라스틱 박스");
		Box bigPaperBox = new Box("큰 종이 박스");
		Box mediumPlasticBox = new Box("중간크기 플라스틱 박스");
		Box smallPaperBox = new Box("작은 종이 박스");
		
		smallPaperBox.add(book);
		smallPaperBox.add(pen);
		
		mediumPlasticBox.add(phone);
		mediumPlasticBox.add(smallPaperBox);
		
		bigPaperBox.add(pen);
		bigPaperBox.add(mediumPlasticBox);
		
		hugePlasticBox.add(ball);
		hugePlasticBox.add(bigPaperBox);
		
		
		// hugePlasticBox 아래 있는 내용 모두 출력
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

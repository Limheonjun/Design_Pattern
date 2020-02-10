package SingletonPattern;

public class Main {

	public static void main(String[] args) {
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		// 동일한 인스턴스
		System.out.println(speaker1); 
		System.out.println(speaker2);
		
		System.out.println(speaker1.getVolume()); // 5
		System.out.println(speaker2.getVolume()); // 5
		
		speaker1.setVolume(11);
		System.out.println(speaker1.getVolume()); // 11
		System.out.println(speaker2.getVolume()); // 11
		
		speaker2.setVolume(22);
		System.out.println(speaker1.getVolume()); // 22
		System.out.println(speaker2.getVolume()); // 22
	
	}

}

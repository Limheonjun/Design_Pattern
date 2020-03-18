package VisitorPattern;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {	
		// 여러개의 방문 지점(사무실, 가정집)에 대해 동일한 비지터(티비 수리기사)가 처리
		ArrayList<Visitable> places = new ArrayList<>();
		places.add(new House());
		places.add(new Office());
		
		TVRepairman tvRepairman = new TVRepairman();
		
		for(Visitable place : places) {
			place.accept(tvRepairman);
		}
		
		System.out.println("======================");
		
		// 한개의 방문 지점(사무실)에 대해 여러 비지터(티비 수리기사, 컴퓨터 수리기사) 처리
		ArrayList<Visitor> visitors = new ArrayList<>();
		visitors.add(new TVRepairman());
		visitors.add(new ComputerRepairman());
		
		Office office = new Office();
		
		for(Visitor visitor : visitors) {
			office.accept(visitor);
		}

	}
}

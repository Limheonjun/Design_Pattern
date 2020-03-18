package VisitorPattern;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {	
		// �������� �湮 ����(�繫��, ������)�� ���� ������ ������(Ƽ�� �������)�� ó��
		ArrayList<Visitable> places = new ArrayList<>();
		places.add(new House());
		places.add(new Office());
		
		TVRepairman tvRepairman = new TVRepairman();
		
		for(Visitable place : places) {
			place.accept(tvRepairman);
		}
		
		System.out.println("======================");
		
		// �Ѱ��� �湮 ����(�繫��)�� ���� ���� ������(Ƽ�� �������, ��ǻ�� �������) ó��
		ArrayList<Visitor> visitors = new ArrayList<>();
		visitors.add(new TVRepairman());
		visitors.add(new ComputerRepairman());
		
		Office office = new Office();
		
		for(Visitor visitor : visitors) {
			office.accept(visitor);
		}

	}
}

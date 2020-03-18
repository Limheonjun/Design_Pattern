package VisitorPattern;

public class ComputerRepairman implements Visitor{
	@Override
	public void visit(Office office) {
		System.out.println(office.getName()+"�� ��ǻ�͸� ����&���� �մϴ�");
	}
	@Override
	public void visit(House house) {
		System.out.println(house.getName()+"�� ��ǻ�͸� ����&���� �մϴ�");
	}
}

package VisitorPattern;

public class TVRepairman implements Visitor{
	@Override
	public void visit(Office office) {
		System.out.println(office.getName()+"�� TV�� ����&���� �մϴ�");
	}
	@Override
	public void visit(House house) {
		System.out.println(house.getName()+"�� TV�� ����&���� �մϴ�");
	}
}

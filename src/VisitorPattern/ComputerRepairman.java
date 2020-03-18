package VisitorPattern;

public class ComputerRepairman implements Visitor{
	@Override
	public void visit(Office office) {
		System.out.println(office.getName()+"의 컴퓨터를 점검&수리 합니다");
	}
	@Override
	public void visit(House house) {
		System.out.println(house.getName()+"의 컴퓨터를 점검&수리 합니다");
	}
}

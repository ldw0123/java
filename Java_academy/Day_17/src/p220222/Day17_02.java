package p220222;

public class Day17_02 {

	public static void main(String[] args) {
		
		Sedan sedan1 = new Sedan();
		Truck truck1 = new Truck();
		
		sedan1.upSpeed(300);
		truck1.upSpeed(100);
		sedan1.seatNum = 5;
		truck1.capacity = 50;
		
		System.out.println("�¿��� �ӵ��� " + sedan1.speed + "km, �¼� ���� " + sedan1.getSeatNum() + "�� �Դϴ�.");
		System.out.println("Ʈ�� �ӵ��� " + truck1.speed + "km, ���緮�� " + truck1.getCapacity() + "�� �Դϴ�.");

	}

}

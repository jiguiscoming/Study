
public class Study0421 {
	public static void main(String[] args) {
		// ���Ϳ� ���� �̿��ؼ� ��ü �����
		Car mine = new Car();
		mine.setKind("������");
		mine.setSpeed(0);
		
		System.out.println(mine.getKind());
		System.out.println("ù�ӵ��� " + mine.getSpeed());
		
		mine.upSpeed(50);
		System.out.println("���� �ӵ��� +" + mine.getSpeed());
		
		mine.downSpeed(10);
		System.out.println("���� �ӵ��� -" + mine.getSpeed());

		Car yours = new Car();
		yours.setKind("BMW");
		yours.setSpeed(0);
		
		yours.upSpeed(100);
		System.out.println("�� "+ yours.getKind() + "����. ���� ���� ��������.");
		System.out.println("���� ���� �ü� " + yours.getSpeed() + "km");
			
	
	}
}

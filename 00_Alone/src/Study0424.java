
public class Study0424 {
	public static void main(String[] args) {

		// �ǻ���� �����
		// ���� ����ؿ�
		// ������ �޾ƿ�.
		// ������ 00�� 8�����Դϴ�.
		// ����� 00�� 13�����Դϴ�.
		
		
		
		// ������ 00�� �Կ����Դϴ�.
		// ����� 00�� �Կ����Դϴ�.
		// ���� ���������� �Կ��� �ֿϵ����� 2���� �Դϴ�.
		
		Doctor d1 = new Doctor();
		
		Guest g1 = new Guest();
		Guest g2 = new Guest();
		
		d1.ask(g1);
		d1.ask(g2);
		
		System.out.print("���� ���������� �Կ��� �ֿϵ����� ��");
		System.out.println(Guest.getCountInTheHospital() + "���� �Դϴ�.");
		
	}
}

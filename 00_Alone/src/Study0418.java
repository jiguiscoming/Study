
public class Study0418 {
	public static void main(String[] args) {

		// continue�� �̿��� ����ó��

		// �޷� ���� ���

		// �޷� ���� ���

		for (int day = 1; day <= 31; day++) {
			for (int month = 1; month <= 12; month++) {
				if (month == 2 && day > 28) {
					System.out.print("\t\t");
					continue;
				}
				System.out.printf("%d��%02d�� ", month, day);
			}
			System.out.println();

		}
		

	}
}

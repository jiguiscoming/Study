
public class Study01 {
	public static void main(String[] args) {

		// for ���� ���

		// ������� 3�� �ٽ� Ǯ�� (�� �������)

		// z -> ���� �ѹ�
		// z -> ���� �ѹ�
		// z z -> ���� �ι�
		// z z -> ���� �ι�
		// z z z -> ������

		for (int i = 2; i <= 6; i++) {
			for (int j = 1; j < i; j++) {
				if (j % 2 == 1) {
					System.out.print("z");
				}
				if (j % 2 == 0) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
	}
}

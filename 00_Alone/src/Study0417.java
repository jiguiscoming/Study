
public class Study0417 {
	public static void main(String[] args) {

		// Study 01 for ���� while������ �ٲ㼭 �ۼ��غ���
		// While ���� ���� ���ط� ���̱�

		// z
		// z 
		// z z
		// z z
		// z z z

		int i = 2;
		while (i <= 6) {
			i++;
			int j = 1;
			while (j < i) {
				j++;
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

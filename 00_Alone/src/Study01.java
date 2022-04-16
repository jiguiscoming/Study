
public class Study01 {
	public static void main(String[] args) {

		// for 구문 배움

		// 어려웠던 3번 다시 풀기 (내 생각대로)

		// z -> 성립 한번
		// z -> 성립 한번
		// z z -> 성립 두번
		// z z -> 성립 두번
		// z z z -> 세번만

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

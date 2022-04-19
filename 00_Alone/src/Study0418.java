
public class Study0418 {
	public static void main(String[] args) {

		// continue를 이용한 예외처리

		// 달력 가로 출력

		// 달력 세로 출력

		for (int day = 1; day <= 31; day++) {
			for (int month = 1; month <= 12; month++) {
				if (month == 2 && day > 28) {
					System.out.print("\t\t");
					continue;
				}
				System.out.printf("%d월%02d일 ", month, day);
			}
			System.out.println();

		}
		

	}
}

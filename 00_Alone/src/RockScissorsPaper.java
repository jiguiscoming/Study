import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {
	public static void main(String[] args) {

		// 가위바위보

		// 안내

		// 판정 & 결과
		// 나:
		// 컴 :
		// 승/패/무승부

		Random r = new Random();
		Scanner k = new Scanner(System.in);

		int count = 0;
		int win = 1;
		int max = 0;

		String[] table = { "", "가위", "바위", "보" };

		while (true) {

			System.out.println("--------");
			System.out.println("1.가위");
			System.out.println("2.바위");
			System.out.println("3.보");
			System.out.println("4.게임종료");
			System.out.println("--------");

			int comNum = r.nextInt(3) + 1;
			System.err.println(table[comNum]); // 개발자 확인용
			System.out.println("가위바위보?! (1~4 입력)");
			int myNum = k.nextInt();

			if (myNum < 1 || myNum > 4) {
				System.out.println("입력오류 (1~4를 넣어주시오)");
				continue;
			} else if (myNum == 4) {
				System.out.println("게임을 종료합니다.");
				System.out.println("훌륭합니다.");
				System.out.println("당신은 총 " + count + "번 이겼습니다.");
				System.out.println("당신의 최대연승기록은 " + max + "번 입니다.");
				break;
			}

			System.out.println("나 : " + table[myNum]);
			System.out.println("컴퓨터 : " + table[comNum]);

			if (myNum == 1) {
				if (comNum == 1) {
					System.out.println("비겼다,,");
					System.out.println("당신은 " + win + "번 연승했습니다.");
					win = 0;
				} else if (comNum == 2) {
					System.out.println("졌다ㅠㅠ");
					System.out.println("당신은 " + win + "번 연승했습니다.");
					win = 0;
				} else {
					System.out.println("이겼다!!");
					count++;
					win++;
					System.out.println("당신은 " + win + "번 연승했습니다.");
				}
			} else if (myNum == 2) {
				if (comNum == 1) {
					System.out.println("이겼다!!");
					count++;
					win++;
					System.out.println("당신은 " + win + "번 연승했습니다.");
				} else if (comNum == 2) {
					System.out.println("비겼다,,");
					System.out.println("당신은 " + win + "번 연승했습니다.");
					win = 0;
				} else {
					System.out.println("졌다ㅠㅠ");
					System.out.println("당신은 " + win + "번 연승했습니다.");
					win = 0;
				}
			} else if (myNum == 3) {
				if (comNum == 1) {
					System.out.println("졌다ㅠㅠ");
					System.out.println("당신은 " + win + "번 연승했습니다.");
					win = 0;
				} else if (comNum == 2) {
					System.out.println("이겼다!!");
					count++;
					win++;
					System.out.println("당신은 " + win + "번 연승했습니다.");
				} else {
					System.out.println("비겼다,,");
					System.out.println("당신은 " + win + "번 연승했습니다.");
					win = 0;
				}
			}
			System.out.println("*************");
			if (win > max) {
				max = win;
			}
		}

		// 게임 반복
		// 예외처리

		// 몇 번 이겼나?
		// @ 연승처리 (이거 하려면 4. 종료 저거 해야돼요)
		// @ 최대연승
		// (연승과 최대연승은 다르죠? 2번 이겼다 지면 연승은 깨지는 거고
		// 4번 연승한 적이 있다가 게임을 종료하면 최대연승은 4겠죠)

	}
}

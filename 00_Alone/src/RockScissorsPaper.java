import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {
	public static void main(String[] args) {

		// ����������

		// �ȳ�

		// ���� & ���
		// ��:
		// �� :
		// ��/��/���º�

		Random r = new Random();
		Scanner k = new Scanner(System.in);

		int count = 0;
		int win = 1;
		int max = 0;

		String[] table = { "", "����", "����", "��" };

		while (true) {

			System.out.println("--------");
			System.out.println("1.����");
			System.out.println("2.����");
			System.out.println("3.��");
			System.out.println("4.��������");
			System.out.println("--------");

			int comNum = r.nextInt(3) + 1;
			System.err.println(table[comNum]); // ������ Ȯ�ο�
			System.out.println("����������?! (1~4 �Է�)");
			int myNum = k.nextInt();

			if (myNum < 1 || myNum > 4) {
				System.out.println("�Է¿��� (1~4�� �־��ֽÿ�)");
				continue;
			} else if (myNum == 4) {
				System.out.println("������ �����մϴ�.");
				System.out.println("�Ǹ��մϴ�.");
				System.out.println("����� �� " + count + "�� �̰���ϴ�.");
				System.out.println("����� �ִ뿬�±���� " + max + "�� �Դϴ�.");
				break;
			}

			System.out.println("�� : " + table[myNum]);
			System.out.println("��ǻ�� : " + table[comNum]);

			if (myNum == 1) {
				if (comNum == 1) {
					System.out.println("����,,");
					System.out.println("����� " + win + "�� �����߽��ϴ�.");
					win = 0;
				} else if (comNum == 2) {
					System.out.println("���٤Ф�");
					System.out.println("����� " + win + "�� �����߽��ϴ�.");
					win = 0;
				} else {
					System.out.println("�̰��!!");
					count++;
					win++;
					System.out.println("����� " + win + "�� �����߽��ϴ�.");
				}
			} else if (myNum == 2) {
				if (comNum == 1) {
					System.out.println("�̰��!!");
					count++;
					win++;
					System.out.println("����� " + win + "�� �����߽��ϴ�.");
				} else if (comNum == 2) {
					System.out.println("����,,");
					System.out.println("����� " + win + "�� �����߽��ϴ�.");
					win = 0;
				} else {
					System.out.println("���٤Ф�");
					System.out.println("����� " + win + "�� �����߽��ϴ�.");
					win = 0;
				}
			} else if (myNum == 3) {
				if (comNum == 1) {
					System.out.println("���٤Ф�");
					System.out.println("����� " + win + "�� �����߽��ϴ�.");
					win = 0;
				} else if (comNum == 2) {
					System.out.println("�̰��!!");
					count++;
					win++;
					System.out.println("����� " + win + "�� �����߽��ϴ�.");
				} else {
					System.out.println("����,,");
					System.out.println("����� " + win + "�� �����߽��ϴ�.");
					win = 0;
				}
			}
			System.out.println("*************");
			if (win > max) {
				max = win;
			}
		}

		// ���� �ݺ�
		// ����ó��

		// �� �� �̰峪?
		// @ ����ó�� (�̰� �Ϸ��� 4. ���� ���� �ؾߵſ�)
		// @ �ִ뿬��
		// (���°� �ִ뿬���� �ٸ���? 2�� �̰�� ���� ������ ������ �Ű�
		// 4�� ������ ���� �ִٰ� ������ �����ϸ� �ִ뿬���� 4����)

	}
}

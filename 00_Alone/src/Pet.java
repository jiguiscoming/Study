import java.util.Scanner;

public class Pet {

	private String type;
	private static final String STATE = "�����Դϴ�.";
	private int month;
	private static int cnt;
	
	public Pet() {
		cnt++;
	}
	
	
	
	Scanner k = new Scanner(System.in);
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	void moving() {
		System.out.println("������ ���¸� �˰� �ͽ��ϴ�.");
		System.out.println("���� : ");
		type = k.next();
		System.out.println(type + "�� " + STATE);
	}
	
	void month() {
		System.out.println("������ ���� ���� �˰� �ͽ��ϴ�.");
		System.out.println("���� : ");
		type = k.next();
		System.out.println("�� ���� : ");
		month = k.nextInt();
		System.out.println(type+ "�� " + month + "�����Դϴ�.");
	}
	
	static void printCount() {
		System.out.println("���� �ֿϵ����� ���� " + cnt + "�����Դϴ�.");
	}
	
	
	
	
	
	
	
}

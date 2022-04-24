import java.util.Scanner;

public class Pet {

	private String type;
	private static final String STATE = "움직입니다.";
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
		System.out.println("동물의 상태를 알고 싶습니다.");
		System.out.println("종류 : ");
		type = k.next();
		System.out.println(type + "가 " + STATE);
	}
	
	void month() {
		System.out.println("동물의 개월 수를 알고 싶습니다.");
		System.out.println("종류 : ");
		type = k.next();
		System.out.println("몇 개월 : ");
		month = k.nextInt();
		System.out.println(type+ "는 " + month + "개월입니다.");
	}
	
	static void printCount() {
		System.out.println("현재 애완동물의 수는 " + cnt + "마리입니다.");
	}
	
	
	
	
	
	
	
}

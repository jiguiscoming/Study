import java.util.Scanner;

public abstract class Pet0425 {

	String name;
	int month;
	String state;
	
	Scanner k = new Scanner(System.in);

	public Pet0425() {
		// TODO Auto-generated constructor stub
	}

	public Pet0425(String name, int month, String state) {
		super();
		this.name = name;
		this.month = month;
		this.state = state;
	}
	
	public void petInfo() {
		System.out.println("이름 : ");
		name = k.next();
		System.out.println("개월수 : ");
		month = k.nextInt();
		System.out.println("상태 : ");
		state = k.next();
	}

}

import java.util.Scanner;

public class Guest {

	String type;
	String name;
	int month;
	Scanner mouth;
	static int countInTheHospital;
	
	int keepGoing = 0;

		
		public void answerTheInfo() {
			mouth = new Scanner(System.in);
			
			System.out.println("���� : ");
			type = mouth.next();
			System.out.println("�̸� : ");
			name = mouth.next();
			System.out.println("������ : ");
			month = mouth.nextInt();
			
			countInTheHospital++;
		}
		
		

	public static int getCountInTheHospital() {
		return countInTheHospital;
	}
	
	
	
}

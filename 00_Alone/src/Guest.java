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
			
			System.out.println("종류 : ");
			type = mouth.next();
			System.out.println("이름 : ");
			name = mouth.next();
			System.out.println("개월수 : ");
			month = mouth.nextInt();
			
			countInTheHospital++;
		}
		
		

	public static int getCountInTheHospital() {
		return countInTheHospital;
	}
	
	
	
}

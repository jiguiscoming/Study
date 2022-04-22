
public class Move {

	private String animal;
	private static final String MOVING = "움직입니다.";
	private static int count;
	
	
	public Move() {
		// TODO Auto-generated constructor stub
	}
	
	
	




	public Move(String animal) {
		super();
		this.animal = animal;
		count++;
	}



	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public static String getMoving() {
		return MOVING;
	}
	
	public static int getCount() {
		return count;
	}
	
	public void printInfo() {
		System.out.println(animal + "가 " + MOVING);
	}
	
	
	
	
}


public class Month {

	private String animal;
	private int month;
	private static int count;

	public static int getCount() {
		return count;
	}

	public Month() {
		
	}
	
	public Month(String animal, int month) {
		super();
		this.animal = animal;
		this.month = month;
		count++;
	}


	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void printInfo() {
		System.out.println(animal + "는 " + month + "개월입니다.");
	}
	
	
	
	
	
}


public class Month {

	private String animal;
	private int month;

	public Month() {
		// TODO Auto-generated constructor stub
	}
	
	public Month(String animal, int month) {
		super();
		this.animal = animal;
		this.month = month;
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

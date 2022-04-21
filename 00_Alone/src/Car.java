
public class Car {

	private String kind;
	private int speed;
	
	public Car() {
		System.out.println("-------------");
		System.out.println("차가 감지 되었다.");
	}
	
	
	
	 public Car(String kind, int speed) {
		super();
		this.kind = kind;
		this.speed = speed;
	}



	public void upSpeed(int i) {
		if (speed+i >300) {
			speed = 300;
		} else {
			speed+=i;
		}
	}
	
	public void downSpeed(int i) {
		if (speed-i < 0) {
			speed = 0;
		}else {
			speed-=i;
		}
	}



	public String getKind() {
		return kind;
	}



	public void setKind(String kind) {
		this.kind = kind;
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
}

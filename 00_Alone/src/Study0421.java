
public class Study0421 {
	public static void main(String[] args) {
		// 게터와 세터 이용해서 객체 만들기
		Car mine = new Car();
		mine.setKind("쉐보레");
		mine.setSpeed(0);
		
		System.out.println(mine.getKind());
		System.out.println("첫속도는 " + mine.getSpeed());
		
		mine.upSpeed(50);
		System.out.println("변한 속도는 +" + mine.getSpeed());
		
		mine.downSpeed(10);
		System.out.println("변한 속도는 -" + mine.getSpeed());

		Car yours = new Car();
		yours.setKind("BMW");
		yours.setSpeed(0);
		
		yours.upSpeed(100);
		System.out.println("넌 "+ yours.getKind() + "구나. 좋은 차를 가졌구나.");
		System.out.println("너의 차는 시속 " + yours.getSpeed() + "km");
			
	
	}
}

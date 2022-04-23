
public class Study0423 {
	public static void main(String[] args) {
		// 강아지가 움직입니다.
		// 고양이가 움직입니다.
		// 강아지는 8개월입니다.
		// 고양이는 13개월입니다.
		// 현재 우리집 애완동물 수는 2마리 입니다.
		
		Pet dog = new Pet();
		
		dog.moving();
		dog.month();
		
		Pet cat = new Pet();
		
		cat.moving();
		cat.month();
		
		Pet.printCount();
	}
}

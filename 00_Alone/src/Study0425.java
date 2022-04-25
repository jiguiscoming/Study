
public class Study0425 {
	public static void main(String[] args) {
		
		// 메소드, 객체 이용
		// isa && hasa
		// abstract
		
		//Today I Learned//
		
		// 고양이, 강아지 == 동물 추상적 // 이름, 개월수, 상태(양호, 경미, 중증)
		// 주인 // 이름, 나이, 성별
		// 의사 : 건강-> 퇴원 / 경미-> 치료 / 중증 -> 입원
		// 병원에 왔다 간 동물의 수
		
		Owner person1 = new Owner();
		Cat cat1 = new Cat();
		
		
		Owner person2 = new Owner();
		Dog dog1 = new Dog();
		
		Doctor0425 d = new Doctor0425();
		
		d.judge(person1, cat1);
		d.judge(person2, dog1);
		
	}
	
	
	
	
}

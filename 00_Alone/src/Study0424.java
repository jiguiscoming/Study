
public class Study0424 {
	public static void main(String[] args) {

		// 의사쌤이 물어요
		// 고객이 대답해요
		// 정보를 받아요.
		// 강아지 00은 8개월입니다.
		// 고양이 00은 13개월입니다.
		
		
		
		// 강아지 00은 입원중입니다.
		// 고양이 00은 입원중입니다.
		// 현재 동물병원에 입원한 애완동물은 2마리 입니다.
		
		Doctor d1 = new Doctor();
		
		Guest g1 = new Guest();
		Guest g2 = new Guest();
		
		d1.ask(g1);
		d1.ask(g2);
		
		System.out.print("현재 동물병원에 입원한 애완동물은 총");
		System.out.println(Guest.getCountInTheHospital() + "마리 입니다.");
		
	}
}

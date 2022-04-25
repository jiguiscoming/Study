
public class Doctor0425 {
	
	
	public Doctor0425() {
		
	}

	public void judge(Owner person, Pet0425 pet) {
	System.out.println("주인 정보 먼저 알려주세요");
	getOwnerInfo(person);
	System.out.println("애완동물 정보 알려주세요");
	getPetInfo(pet);
	if (pet.state.equals("양호")) {
		System.out.println("퇴원");
	} else if (pet.state.equals("경미")) {
		System.out.println("치료");
	} else if (pet.state.equals("중증")) {
		System.out.println("입원");
	}
	}

	public void getOwnerInfo(Owner person) {
		person.mouthOwnerIfo();
	}
	
	public void getPetInfo(Pet0425 pet) {
		pet.petInfo();
	}
	

	}
	

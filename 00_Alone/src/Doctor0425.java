
public class Doctor0425 {
	
	
	public Doctor0425() {
		
	}

	public void judge(Owner person, Pet0425 pet) {
	System.out.println("���� ���� ���� �˷��ּ���");
	getOwnerInfo(person);
	System.out.println("�ֿϵ��� ���� �˷��ּ���");
	getPetInfo(pet);
	if (pet.state.equals("��ȣ")) {
		System.out.println("���");
	} else if (pet.state.equals("���")) {
		System.out.println("ġ��");
	} else if (pet.state.equals("����")) {
		System.out.println("�Կ�");
	}
	}

	public void getOwnerInfo(Owner person) {
		person.mouthOwnerIfo();
	}
	
	public void getPetInfo(Pet0425 pet) {
		pet.petInfo();
	}
	

	}
	

package com.js.animalhosipital;

public class Doctor {
	

	public Doctor() {

	}

	public void judge(Owner person, Pet pet) {
		System.out.println("���� ���� ���� �˷��ּ���");
		getOwnerInfo(person);
		
		while (true) {
			System.out.println("�ֿϵ��� ���� �˷��ּ���");
			getPetInfo(pet);
			if (pet.state.equals("��ȣ")) {
				System.out.println("���");
				break;
			} else if (pet.state.equals("���")) {
				System.out.println("ġ��");
				break;
			} else if (pet.state.equals("����")) {
				System.out.println("�Կ�");
				break;
			} else {
				System.out.println("�ٽ� �Է����ּ���(��ȣ, ���, ����)");
				continue;
			}
		}
	}

	public void getOwnerInfo(Owner person) {
		person.mouthOwnerIfo();
	}

	public void getPetInfo(Pet pet) {
		pet.petInfo();
	}

	
	
}

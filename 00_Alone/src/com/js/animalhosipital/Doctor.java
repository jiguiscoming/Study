package com.js.animalhosipital;

public class Doctor {
	

	public Doctor() {

	}

	public void judge(Owner person, Pet pet) {
		System.out.println("주인 정보 먼저 알려주세요");
		getOwnerInfo(person);
		
		while (true) {
			System.out.println("애완동물 정보 알려주세요");
			getPetInfo(pet);
			if (pet.state.equals("양호")) {
				System.out.println("퇴원");
				break;
			} else if (pet.state.equals("경미")) {
				System.out.println("치료");
				break;
			} else if (pet.state.equals("중증")) {
				System.out.println("입원");
				break;
			} else {
				System.out.println("다시 입력해주세요(양호, 경미, 중증)");
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

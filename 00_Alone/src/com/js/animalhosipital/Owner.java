package com.js.animalhosipital;
import java.util.Scanner;

public class Owner {

	String name;
	int age;
	String gender;
	Pet pet;
	
	Scanner k = new Scanner(System.in);
	
	public void mouthOwnerIfo() {
		System.out.println("이름 : ");
		name = k.next();
		System.out.println("나이 : ");
		age = k.nextInt();
		System.out.println("성별 : ");
		gender = k.next();
		
	}
	
	public void mouthPetInfo() {
		pet.petInfo();
	}
	
	
}

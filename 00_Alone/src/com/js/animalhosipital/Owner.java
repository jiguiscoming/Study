package com.js.animalhosipital;
import java.util.Scanner;

public class Owner {

	String name;
	int age;
	String gender;
	Pet pet;
	
	Scanner k = new Scanner(System.in);
	
	public void mouthOwnerIfo() {
		System.out.println("�̸� : ");
		name = k.next();
		System.out.println("���� : ");
		age = k.nextInt();
		System.out.println("���� : ");
		gender = k.next();
		
	}
	
	public void mouthPetInfo() {
		pet.petInfo();
	}
	
	
}

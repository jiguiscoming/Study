package com.js.animalhosipital;
import java.util.Scanner;

public class Pet{
	
	static int num = 0;

	protected String name;
	protected int month;
	protected String state;
	
	Scanner k = new Scanner(System.in);

	public Pet() {
		num++;
	}

	public Pet(String name, int month, String state) {
		super();
		this.name = name;
		this.month = month;
		this.state = state;
	}
	
	public void petInfo() {
		System.out.println("이름 : ");
		name = k.next();
		System.out.println("개월수 : ");
		month = k.nextInt();
		System.out.println("상태 : ");
		state = k.next();
	}
	
	static void getNumOfAnimal() {
		System.out.println("--------------------------");
		System.out.print("오늘 동물병원 방문 수(동물기준) : ");
		System.out.println(num);
	}

}

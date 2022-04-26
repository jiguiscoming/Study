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
		System.out.println("�̸� : ");
		name = k.next();
		System.out.println("������ : ");
		month = k.nextInt();
		System.out.println("���� : ");
		state = k.next();
	}
	
	static void getNumOfAnimal() {
		System.out.println("--------------------------");
		System.out.print("���� �������� �湮 ��(��������) : ");
		System.out.println(num);
	}

}

package com.js.animalhosipital;
import java.util.Scanner;

public class Pet{

	protected String name;
	protected int month;
	protected String state;
	
	Scanner k = new Scanner(System.in);

	public Pet() {
		// TODO Auto-generated constructor stub
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

}

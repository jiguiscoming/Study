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
		System.out.println("이름 : ");
		name = k.next();
		System.out.println("개월수 : ");
		month = k.nextInt();
		System.out.println("상태 : ");
		state = k.next();
	}

}

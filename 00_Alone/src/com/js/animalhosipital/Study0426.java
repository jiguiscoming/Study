package com.js.animalhosipital;

public class Study0426 {
	public static void main(String[] args) {
		
		// �޼ҵ�, ��ü �̿�
		// isa && hasa
		// abstract
		
		//Today I Learned//
		
		// �����, ������ == ���� �߻��� // �̸�, ������, ����(��ȣ, ���, ����)
		// ���� // �̸�, ����, ����
		// �ǻ� : �ǰ�-> ��� / ���-> ġ�� / ���� -> �Կ�
		// ������ �Դ� �� ������ ��
		
		Owner person1 = new Owner();
		Cat cat1 = new Cat();
		
		
		Owner person2 = new Owner();
		Dog dog1 = new Dog();
		
		Doctor d = new Doctor();
		
		d.judge(person1, cat1);
		d.judge(person2, dog1);
		
	}
	
	
	
	
}

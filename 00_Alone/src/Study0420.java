import java.util.Scanner;

public class Study0420 {
	public static int plus(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("�Լ�--------------------");

		Scanner k = new Scanner(System.in);

		System.out.println("a : ");
		int a = k.nextInt();
		System.out.println("b : ");
		int b = k.nextInt();

		System.out.println(plus(a, b));
		
		System.out.println("���ڿ� �и�------------------");
	
		String fruit = "���,������,��";
		String[] cc = fruit.split(",");
		
		for (String menu : cc) {
			System.out.println(menu);
		}
		
		System.out.println("����ó��----------------------");
		
		while(true) {
			
			Thread.sleep(100);
			System.out.println("x : ");
			int x = k.nextInt();
			
			Thread.sleep(100);
			System.out.println("y : ");
			int y = k.nextInt();
			
			try {
				System.out.println(x/y);
				
			} catch (Exception e) {
				System.out.println("�Է¿���");
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
	}

	// public static void

	// try/catch
	// ����ó�� ����

}

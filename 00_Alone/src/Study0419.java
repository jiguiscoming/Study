
public class Study0419 {
	public static void main(String[] args) {
	
	// Array¿Í forEach
	
	int[] a = {1,2,3};
	
	int[] b = new int[2];
	
	int[] c = new int[] {1,2,3};
	
	int[] d;
	d = new int []{1,2,3};
	
	int[] e = new int[2];
	e[0] = 1;
	e[1] = 2;
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
	for (int all : e) {
		System.out.println(all);
	}
	
	
	
}
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Study0427 {
	public static void main(String[] args) {
		
		// ArrayList 열심히 연습해보기
		System.out.println("====Array(ar1)====");
		int[] ar1 = new int[4];
		for (int i : ar1) {
			System.out.println(i);
		}
		
		System.out.println("====ArrayList(ar2)====");
		ArrayList<Integer> ar2 = new ArrayList<>();
		ar2.add(0);
		ar2.add(0);
		ar2.add(0);
		ar2.add(0);
		
	for (int i = 0; i < ar2.size(); i++) {
		System.out.println(ar2.get(i));
	}
		
	System.out.println("====HashSet(ar3)====");
	HashSet<Integer> ar3 = new HashSet<Integer>();
	ar3.add(0);
	ar3.add(0);
	ar3.add(0);
	ar3.add(0);
	
	//ArrayList<Integer> ar3_1 = new ArrayList<Integer>(ar3);
	
	for (Integer i : ar3) {
		System.out.println(i);
	}
		
	System.out.println("====HashMap(ar4)====");
	HashMap<String, Integer> ar4 = new HashMap<String, Integer>();
	ar4.put("a", 1);
	ar4.put("b", 2);
	ar4.put("c", 3);
	ar4.put("d", 4);
	
	System.out.println(ar4.get("a"));
	
	System.out.println("====제일 중요한 부분===");
	
	ArrayList<Student> students = new ArrayList<Student>();
	
	students.add(new Student("은지", 20, 90.87));
	students.add(new Student("지수", 26, 98.14));
	students.add(new Student("지민", 27, 93.75));
	
	System.out.println("학생의 수 : " + students.size());
	System.out.println("첫 학생의 이름 : " + students.get(0).getName());
	System.out.println("두번째 학생의 나이 : " + students.get(1).getAge());
	System.out.println("세번째 학생의 평균점수 : " + students.get(2).getScore());
	
	
	
	
		
	}
}

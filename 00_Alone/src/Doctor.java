
public class Doctor {

	static final String HOSPITAL = "�Կ����Դϴ�.";
	
	public void ask(Guest g) {
		g.answerTheInfo();
		sayTheState(g);
	}

	public void sayTheState(Guest g) {
		System.out.println(g.type + g.name + "�� " + HOSPITAL);
	}

}

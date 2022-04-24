
public class Doctor {

	static final String HOSPITAL = "입원중입니다.";
	
	public void ask(Guest g) {
		g.answerTheInfo();
		sayTheState(g);
	}

	public void sayTheState(Guest g) {
		System.out.println(g.type + g.name + "은 " + HOSPITAL);
	}

}

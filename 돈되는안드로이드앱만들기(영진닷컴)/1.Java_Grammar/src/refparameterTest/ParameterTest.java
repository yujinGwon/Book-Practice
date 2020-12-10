package refparameterTest;

class Robot{
	String name;
}

public class ParameterTest {
	public static void main(String[] args) {
		
		Robot r = new Robot();
		r.name = "Â¯°¡";
		System.out.println(r.name);
		
		changeName(r);
		System.out.println(r.name);
	}
	
	static void changeName(Robot r) {
		r.name="¸¶Â¡°¡";
		System.out.println(r.name);
	}
}

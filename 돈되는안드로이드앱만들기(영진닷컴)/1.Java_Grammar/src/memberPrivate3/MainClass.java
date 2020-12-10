package memberPrivate3;

public class MainClass {
	public static void main(String[] args) {
		Robot r1 = new Robot();
		System.out.println(r1.getter());
		System.out.println(r1.x);
		System.out.println(r1.y);
		
		r1.setter("Â¯°¡");
		System.out.println(r1.getter());
	}
}

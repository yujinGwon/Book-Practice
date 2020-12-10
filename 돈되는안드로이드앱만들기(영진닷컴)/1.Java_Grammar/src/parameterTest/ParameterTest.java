package parameterTest;

class Robot{
	int price;
	String name;
}

public class ParameterTest {
	public static void main(String[] args) {
		
		Robot r = new Robot();
		System.out.println("로봇 가격: "+r.price);
		System.out.println("로봇 이름: "+r.name);
		
		changePrice(r.price);
		changeName(r.name);
		
		System.out.println(r.price);
		System.out.println(r.name);
	}
	
	static void changePrice(int price) {
		price = 2000;
		System.out.println(price);
	}
	
	static void changeName(String r) {
		r = "이순신";
		System.out.println(r);
	}
	
	
}

package staticinnerClass;

class Robot{
	// 외부 클래스 변수는 static일 경우만 내부 클래스에서 사용가능
	static int x = 200;
	int age;
	
	static class InnerClass{
		int y = 300;
		static int price = 1000;
		
		void showMe() {
			x = 100;
			System.out.println(x);
			System.out.println(y);
			System.out.println(price);
		}
	}
}

public class InnerClassStatic {
	public static void main(String[] args) {
		Robot.InnerClass inner2 = new Robot.InnerClass();
		inner2.showMe();
	}
}

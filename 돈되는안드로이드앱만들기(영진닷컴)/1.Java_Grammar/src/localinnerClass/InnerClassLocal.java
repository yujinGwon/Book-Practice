package localinnerClass;

class Robot{
	int x = 10;
	final int y = 20;
	
	void local_method() {
		final int a = 100;
		int b = 200; // 자동으로 final이 붙게 ㅗ딘다.
		
		class InnerClass{
			static final int c = 10;
			int d = 20;
			
			void showMe() {
				// a=1000; final 이기 때문에 지역변수를 변경할 수 없다. 
				// b=2000; final 이기 때문에 지역변수를 변경할 수 없다.
				x=11; //Robot 클래스의 변수 x는 변경가능
				// y=11;
				// c=11;
				d=200;
				System.out.println(x);
				System.out.println(y);
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
		}
		InnerClass ic = new InnerClass();
		ic.showMe();
	}
}

public class InnerClassLocal {
	public static void main(String[] args) {
		Robot r1 = new Robot();
		r1.local_method();
	}
}

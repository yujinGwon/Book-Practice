package innerTest;

class Robot{
	private int x = 0;
	int explainOk = 1;
	int price;
	String name;
	InnerClass il;
	
	Robot(){
		il = new InnerClass();
	}
	
	class InnerClass{
		void moveAll() {
			System.out.println("explainOk= " +explainOk);
			System.out.println("x= "+x);
		}
	}
	
	void moveRight() {
		x += 10;
		System.out.println(x);
		il.moveAll(); 	// 외부 클래스에서 내부 클래스의 멤버메소드에 접근하기
						// 위해서는 내부 클래스의 객체명.메소드 형식으로 사용
	}
}

public class Inner {
	public static void main(String[] args) {
		Robot r1 = new Robot();
		r1.moveRight();
	}
}

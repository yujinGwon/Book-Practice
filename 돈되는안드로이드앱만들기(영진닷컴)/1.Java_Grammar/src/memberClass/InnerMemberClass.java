package memberClass;

class Robot{
	private int outter_member = 0;
	int x;
	int explainOk = 1;
	int price = 20000;
	InnerClass il;
	
	Robot(){
		il = new InnerClass();
	}
	
	class InnerClass{
		int inner_field = 0;
		
		// 외부 클래스의 변수는 메소드 안에서만 변경가능
		// price = 50000; 사용할 수 없음
		
		 void innerMethod() {
			 //내부 클래스의 변수 사용
			 System.out.println(inner_field);
			 
			 // 외부 클래스의 변수 사용
			 System.out.println(explainOk);
			 
			 //외부 클래스의 private 변수 사용도 가능
			 System.out.println(outter_member);
			 
			 // 외부 클래스.this.외부 클래스 멤버변수 형식으로 외부 클래스 변수 값을 변경한다.
			 Robot.this.price = 40000;
			 
			 System.out.println(price);
		 }
	}
	
	void moveRight() {
		x += 10;
		System.out.println(x);
		il.innerMethod();
	}
}


public class InnerMemberClass {
	public static void main(String[] args) {
		Robot r1 = new Robot();
		r1.moveRight();
	}
}

package localinnerClass;

class Robot{
	int x = 10;
	final int y = 20;
	
	void local_method() {
		final int a = 100;
		int b = 200; // �ڵ����� final�� �ٰ� �ǵ��.
		
		class InnerClass{
			static final int c = 10;
			int d = 20;
			
			void showMe() {
				// a=1000; final �̱� ������ ���������� ������ �� ����. 
				// b=2000; final �̱� ������ ���������� ������ �� ����.
				x=11; //Robot Ŭ������ ���� x�� ���氡��
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

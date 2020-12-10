package staticinnerClass;

class Robot{
	// �ܺ� Ŭ���� ������ static�� ��츸 ���� Ŭ�������� ��밡��
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

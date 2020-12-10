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
		il.moveAll(); 	// �ܺ� Ŭ�������� ���� Ŭ������ ����޼ҵ忡 �����ϱ�
						// ���ؼ��� ���� Ŭ������ ��ü��.�޼ҵ� �������� ���
	}
}

public class Inner {
	public static void main(String[] args) {
		Robot r1 = new Robot();
		r1.moveRight();
	}
}

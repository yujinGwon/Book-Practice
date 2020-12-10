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
		
		// �ܺ� Ŭ������ ������ �޼ҵ� �ȿ����� ���氡��
		// price = 50000; ����� �� ����
		
		 void innerMethod() {
			 //���� Ŭ������ ���� ���
			 System.out.println(inner_field);
			 
			 // �ܺ� Ŭ������ ���� ���
			 System.out.println(explainOk);
			 
			 //�ܺ� Ŭ������ private ���� ��뵵 ����
			 System.out.println(outter_member);
			 
			 // �ܺ� Ŭ����.this.�ܺ� Ŭ���� ������� �������� �ܺ� Ŭ���� ���� ���� �����Ѵ�.
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

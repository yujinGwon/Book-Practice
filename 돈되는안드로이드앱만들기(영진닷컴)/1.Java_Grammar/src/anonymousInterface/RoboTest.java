package anonymousInterface;

interface Robot{
	abstract void mySituation();
}

public class RoboTest {
	public static void main(String[] args) {
		Robot r1 = new Robot() {
			public void mySituation() {
				System.out.println("���� ��ġ x��ǥ : 100" + " y��ǥ: 200");
			}
		}; // ���� Ŭ������ ���๮�̱� ������ ������ �κп� �����ݷ��� ���־�� ������ �߻����� ����.
		r1.mySituation();
	}
}

package dahyungsung;

public class Robot {
	int x, y;
	int power;
	int price;
	String name;
	
	void mySituation() {
		System.out.println("�θ� Ŭ����: ���� ��ġ�� "+x+ ", " +y+ " �Դϴ�.");
	}
}

class FishRobot extends Robot {
	int depth;
	void swim() {
		System.out.println("���� ������ " +depth+" �Դϴ�.");
	}
}

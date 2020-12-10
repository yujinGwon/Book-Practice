package magaeDahyungsung;

public class Robot {
	int x, y;
	int price;
	
	Robot(int price){
		this.price = price;
	}
	
	void mySituation() {
		System.out.println("����Ŭ����: ���� ��ġ�� "+x+" ," +y+ " �Դϴ�.");
	}
}

class FishRobot extends Robot{
	FishRobot(int price){
		super(price);
	}
	
	int depth;
	void swim() {
		System.out.println("���� ������ " +depth+" �Դϴ�.");
	}
}

class DroneRobot extends Robot {
	DroneRobot(int price){
		super(price);
	}
	
	int altitude;
	void file() {
		System.out.println("���� ���� ���� " +altitude+" m�� �ֽ��ϴ�.");
	}
}

class TankRobot extends Robot {
	TankRobot(int price){
		super(price);
	}
	
	int speed;
	void goFoward() {
		System.out.println("���� ���� �ӵ��� "+speed+ " �Դϴ�.");
	}
}

class Purchaser{
	int money = 200000;
	
	void purchase(FishRobot f) {
		money -= f.price;
	}
	
	void purchase(DroneRobot d) {
		money -= d.price;
	}
	
	void purchase(TankRobot t) {
		money -= t.price;
	}
}

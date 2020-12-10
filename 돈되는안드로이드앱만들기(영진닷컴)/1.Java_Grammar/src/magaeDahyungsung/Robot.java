package magaeDahyungsung;

public class Robot {
	int x, y;
	int price;
	
	Robot(int price){
		this.price = price;
	}
	
	void mySituation() {
		System.out.println("조상클래스: 나의 위치는 "+x+" ," +y+ " 입니다.");
	}
}

class FishRobot extends Robot{
	FishRobot(int price){
		super(price);
	}
	
	int depth;
	void swim() {
		System.out.println("나의 수심은 " +depth+" 입니다.");
	}
}

class DroneRobot extends Robot {
	DroneRobot(int price){
		super(price);
	}
	
	int altitude;
	void file() {
		System.out.println("저는 지금 높이 " +altitude+" m에 있습니다.");
	}
}

class TankRobot extends Robot {
	TankRobot(int price){
		super(price);
	}
	
	int speed;
	void goFoward() {
		System.out.println("저는 지금 속도가 "+speed+ " 입니다.");
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

package dahyungsung;

public class Robot {
	int x, y;
	int power;
	int price;
	String name;
	
	void mySituation() {
		System.out.println("부모 클래스: 나의 위치는 "+x+ ", " +y+ " 입니다.");
	}
}

class FishRobot extends Robot {
	int depth;
	void swim() {
		System.out.println("나의 수심은 " +depth+" 입니다.");
	}
}

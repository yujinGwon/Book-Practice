package superTest;

class Robot{
	int x, y;
	int price = 1000;
	
	Robot(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("x: "+x+" y:" +y);
	}
	
	void ShowMe() {
		System.out.println("나는 droneRobot의 부모 클래스입니다.");
	}
}

class droneRobot extends Robot{
	int price = 100;
	
	droneRobot(int x, int y){
		super(x,y);
	}
	
	void showMe() {
		System.out.println("나는 자식 클래스 입니다.");
	}
	
	void showPrice() {
		System.out.println("price= " +price);
		System.out.println("super.price= "+super.price);
		super.ShowMe();
		showMe();
	}
}

public class SuperTest {
	public static void main(String[] args) {
		droneRobot drone1 = new droneRobot(100, 300);
		drone1.showPrice();
	}
}

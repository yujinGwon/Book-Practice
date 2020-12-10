package InterfaceTest;

interface Robot{
	abstract void showSituation();
}

class FishRobot implements Robot {
	
	int depth;
	int x, y;
	
	public void showSituation() {
		System.out.println("나의 위치는 x좌표: "+x+" y좌표: " +y+ "입니다.");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		
		FishRobot fish1 = new FishRobot();
		fish1.x = 100;
		fish1.y = 200;
		fish1.showSituation();
	}
}

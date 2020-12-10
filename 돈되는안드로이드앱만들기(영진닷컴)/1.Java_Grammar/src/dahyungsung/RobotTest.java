package dahyungsung;

public class RobotTest {
	public static void main(String[] args) {
		FishRobot fish1 = new FishRobot();
		Robot r1 = new FishRobot();
		
		r1.x=100;
		r1.y=300;
		// r1.depth=500; 에러발생
		r1.mySituation();
		// r1.swim(); 에러발생
	}

}

package superConstructor;

class Robot{
	Robot(){
		System.out.println("何葛 积己磊");
	}
}

class FishRobot extends Robot{
	FishRobot(){
		System.out.println("磊侥 积己磊");
	}
}

public class RoboTest {
	public static void main(String[] args) {
		FishRobot fish1 = new FishRobot();
	}
}

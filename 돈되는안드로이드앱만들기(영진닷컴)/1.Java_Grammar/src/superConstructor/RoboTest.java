package superConstructor;

class Robot{
	Robot(){
		System.out.println("�θ� ������");
	}
}

class FishRobot extends Robot{
	FishRobot(){
		System.out.println("�ڽ� ������");
	}
}

public class RoboTest {
	public static void main(String[] args) {
		FishRobot fish1 = new FishRobot();
	}
}

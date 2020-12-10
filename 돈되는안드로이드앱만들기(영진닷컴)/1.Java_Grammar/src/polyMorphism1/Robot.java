package polyMorphism1;

public class Robot {
	int x, y;
	void move() {
		System.out.println("로봇 움직이기");
	}
}

class FishRobot extends Robot{
	void move() {
		System.out.println("물고기 로봇 움직이기");
	}
}

class DroneRobot extends Robot {
	void move() {
		System.out.println("드론 로봇 움직이기");
	}
}


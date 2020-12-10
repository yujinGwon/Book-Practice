package polyMorphism2;

public class Robot {
	int x,y;
	void move() {
		System.out.println("로봇 움직이기");
	}
}

class FishRobot extends Robot{

	@Override
	void move() {
		System.out.println("물고기 로봇 움직이기");
	}
}

class DroneRobot extends Robot{

	@Override
	void move() {
		System.out.println("드론 로봇 움직이기");
	}
}

class TankRobot extends Robot{

	@Override
	void move() {
		System.out.println("탱크 로봇 움직이기");
	}
}

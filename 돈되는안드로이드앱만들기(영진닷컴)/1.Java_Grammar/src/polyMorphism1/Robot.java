package polyMorphism1;

public class Robot {
	int x, y;
	void move() {
		System.out.println("�κ� �����̱�");
	}
}

class FishRobot extends Robot{
	void move() {
		System.out.println("����� �κ� �����̱�");
	}
}

class DroneRobot extends Robot {
	void move() {
		System.out.println("��� �κ� �����̱�");
	}
}


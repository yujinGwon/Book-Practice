package polyMorphism2;

public class Robot {
	int x,y;
	void move() {
		System.out.println("�κ� �����̱�");
	}
}

class FishRobot extends Robot{

	@Override
	void move() {
		System.out.println("����� �κ� �����̱�");
	}
}

class DroneRobot extends Robot{

	@Override
	void move() {
		System.out.println("��� �κ� �����̱�");
	}
}

class TankRobot extends Robot{

	@Override
	void move() {
		System.out.println("��ũ �κ� �����̱�");
	}
}

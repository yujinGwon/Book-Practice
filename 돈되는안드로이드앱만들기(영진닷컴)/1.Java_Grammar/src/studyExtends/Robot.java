package studyExtends;

public class Robot {
	int x, y;
	void mySituation() {
		System.out.println("���� ��ġ x: "+x+ " , y: "+y);
	}
}

class FishRobot extends Robot{
	int depth; // ����
	FishRobot(int x, int y, int depth){
		this.x = x;
		this.y = y;
		this.depth = depth;
	}
	
	void swim() {
		System.out.println("�����κ� ����: "+depth + " m");
	}
}

class DroneRobot extends Robot {
	int altitude; // ��
	DroneRobot(int x, int y, int altitude){
		this.x = x;
		this.y = y;
		this.altitude = altitude;
	}
	
	void fly() {
		System.out.println("��зκ� ����: "+altitude+ " m");
	}
}

package studyExtends;

public class Robot {
	int x, y;
	void mySituation() {
		System.out.println("나의 위치 x: "+x+ " , y: "+y);
	}
}

class FishRobot extends Robot{
	int depth; // 수심
	FishRobot(int x, int y, int depth){
		this.x = x;
		this.y = y;
		this.depth = depth;
	}
	
	void swim() {
		System.out.println("물고기로봇 수심: "+depth + " m");
	}
}

class DroneRobot extends Robot {
	int altitude; // 고도
	DroneRobot(int x, int y, int altitude){
		this.x = x;
		this.y = y;
		this.altitude = altitude;
	}
	
	void fly() {
		System.out.println("드론로봇 높이: "+altitude+ " m");
	}
}

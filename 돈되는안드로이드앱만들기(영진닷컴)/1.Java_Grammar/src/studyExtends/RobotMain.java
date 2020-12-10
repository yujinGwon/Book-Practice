package studyExtends;

public class RobotMain {
	public static void main(String[] args) {
		
		Robot r1 = new Robot();
		
		DroneRobot drone1 = new DroneRobot(10, 10, 1000);
		FishRobot fish1 = new FishRobot(20, 30, 2000);
		
		r1.mySituation();
		
		drone1.mySituation();
		drone1.fly();
		
		fish1.mySituation();
		fish1.swim();
		
	}

}

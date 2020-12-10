package studyClass;

public class RobotFactory {
	
	public static void main(String[] args) {
		
		Robot r1 = new Robot(0, 0, "red", "robot1");
		Robot r2 = new Robot(100, 0, "yellow", "robot");
		Robot r3 = new Robot(100, 0, "blue", " robot3");
		
		r1.introduceMe();
		r2.introduceMe();
		r3.introduceMe();
	}

}

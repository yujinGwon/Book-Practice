package polyMorphism2;

public class MainClass {
	static void showMove(Robot r) {
		r.move();
	}
	
	public static void main(String[] args) {
		showMove(new FishRobot());
		showMove(new DroneRobot());
		showMove(new TankRobot());
	}
}

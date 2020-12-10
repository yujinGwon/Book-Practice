package magaeDahyungsung;

public class RobotTest {
	public static void main(String[] args) {
		DroneRobot drone1 = new DroneRobot(50000);
		FishRobot fish1 = new FishRobot(20000);
		TankRobot tank1 = new TankRobot(30000);
		
		Purchaser p1 = new Purchaser();
		p1.purchase(drone1);
		p1.purchase(fish1);
		p1.purchase(tank1);
		
		System.out.println("³²¾Æ ÀÖ´Â µ·: "+p1.money);
	}
}

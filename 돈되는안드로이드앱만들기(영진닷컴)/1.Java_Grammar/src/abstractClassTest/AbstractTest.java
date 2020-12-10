package abstractClassTest;

abstract class Robot{
	int x,y;
	int power;
	String color;
	String name;
	
	abstract void showSituation();
}

class FishRobot extends Robot{
	int x, y;
	int depth;
	
	FishRobot(int x, int y, int depth){
		this.x = x;
		this.y = y;
		this.depth = depth;
	}
	void showSituation() {
		System.out.println("xÁÂÇ¥: "+x+"yÁÂÇ¥: "+y+ "¼ö½É: "+depth);
	}
}

public class AbstractTest {
	public static void main(String[] args) {
		
		FishRobot fish1 = new FishRobot(50, 100, 2000);
		fish1.showSituation();
	}
}

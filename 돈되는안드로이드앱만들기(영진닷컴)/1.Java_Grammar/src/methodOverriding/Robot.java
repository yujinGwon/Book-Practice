package methodOverriding;

public class Robot {
	void myName(String name) {
		System.out.println("���� �̸�: "+name);
	}
}

class FishRobot extends Robot{
	void myName(String name) {
		System.out.println("����� �̸�: " +name);
	}
}

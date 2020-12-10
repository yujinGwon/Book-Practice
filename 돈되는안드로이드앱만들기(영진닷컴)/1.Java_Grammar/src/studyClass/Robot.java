package studyClass;
public class Robot {
	
	int x, y;
	int tpower;
	String color;
	String name;
	int id;
	
	Robot(int x, int y, String color, String name){
		this.x = x;
		this.y = y;
		this.color = color;
		this.name = name;
	}
	
	void moveForward() {
		x += 5;
	}
	
	void moveBack() {
		y -= 5;
	}
	
	void introduceMe() {
		System.out.println("���� �̸��� " +name+ "�Դϴ�.");
		System.out.println("���� ���� " +color+ "�Դϴ�.");
	}
}

package studyClass2;
public class Robot {
	
	int x, y; // �ν��Ͻ� ����
	int power; // �ν��Ͻ� ����
	int price; //  �ν��Ͻ� ����
	String name;
	int id;
	static int robotCount = 0; // Ŭ���� ����, �����ؼ� ����� �� �ִ� ����
	
	Robot(int power, int price, String name){
		this.power = power;
		this.price = price;
		this.name = name;
		
		robotCount += 1; // Robot�� ������ �� ���� number ���� 1�� ����
		id = robotCount;
	}
}

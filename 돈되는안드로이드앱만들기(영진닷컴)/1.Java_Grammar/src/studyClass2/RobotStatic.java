package studyClass2;

public class RobotStatic {
	public static void main(String[] args) {
		Robot r1 = new Robot(600, 100, "¯��");
		Robot r2 = new Robot(1000, 200, "��¡��");
		Robot r3 = new Robot(1000, 200, "�±Ǻ���");
		int num = Robot.robotCount; // ���� ���� = Ŭ���� ����
		System.out.println("���ݱ��� ������ �κ� �� = "+num);
	}
}

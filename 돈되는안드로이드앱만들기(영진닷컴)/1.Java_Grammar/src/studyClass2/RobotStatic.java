package studyClass2;

public class RobotStatic {
	public static void main(String[] args) {
		Robot r1 = new Robot(600, 100, "짱가");
		Robot r2 = new Robot(1000, 200, "마징가");
		Robot r3 = new Robot(1000, 200, "태권브이");
		int num = Robot.robotCount; // 정적 변수 = 클래스 변수
		System.out.println("지금까지 생성된 로봇 수 = "+num);
	}
}

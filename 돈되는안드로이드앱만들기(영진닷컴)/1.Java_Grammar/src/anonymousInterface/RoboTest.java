package anonymousInterface;

interface Robot{
	abstract void mySituation();
}

public class RoboTest {
	public static void main(String[] args) {
		Robot r1 = new Robot() {
			public void mySituation() {
				System.out.println("나의 위치 x좌표 : 100" + " y좌표: 200");
			}
		}; // 무명 클래스는 실행문이기 때문에 마지막 부분에 세미콜론을 해주어야 오류가 발생하지 않음.
		r1.mySituation();
	}
}

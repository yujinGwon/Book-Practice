package threadTest2;

class RunnableTest implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Thread1" +i+ " ");
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		RunnableTest thread = new RunnableTest();
		Thread th1 = new Thread(thread);
		th1.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("mainTh" +i+ " ");
		}
	}
}

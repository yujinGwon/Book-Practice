package threadTest;

class Thread1 extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Thread1" +i+" ");
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		Thread1 thread = new Thread1();
		thread.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("mainTh"+i+" ");
		}
	}
}

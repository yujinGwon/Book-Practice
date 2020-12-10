package genericTest;

import java.util.ArrayList;

public class GenericTest {
	public static void main(String[] args) {
		int sum = 0;
		ArrayList list = new ArrayList();
		list.add(12);
		list.add(24);
		list.add(36);
		
		for (int i = 0; i < list.size(); i++) {
			sum += (int)list.get(i);
		}
		System.out.println(sum);
	}
}

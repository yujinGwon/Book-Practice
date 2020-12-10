package genericTest2;

import java.util.ArrayList;

public class GenericTest {
	public static void main(String[] args) {
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(24);
		list.add(36);
		
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
	}
}

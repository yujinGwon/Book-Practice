package genericTest3;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericTest {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(24);
		list.add(36);
		
		for(int i : list)
			System.out.println(i);
	}
}

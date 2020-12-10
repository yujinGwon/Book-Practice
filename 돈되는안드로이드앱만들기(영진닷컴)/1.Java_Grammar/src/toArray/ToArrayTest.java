package toArray;

import java.util.ArrayList;
import java.util.List;

public class ToArrayTest {
	public static void main(String[] args) {
		
		List<String> mList = new ArrayList<String>();
		// ArrayList<String> mList = new ArrayList<String>(); 라고 해도 된다.
		
		mList.add("조상철");
		mList.add("조단비");
		mList.add("조은비");
		
		// for(List l : mList)
		//	System.out.println(l.get); 컬렉션 타입을 스트링으로 출력할 수 없어서 에러가 남
		// get() 메소드를 사용하여 List 데이터 출력 가능...
		
		/* for (int i = 0; i < mList.size(); i++)
			System.out.println(mList.get(i));
		*/
		
		
		String[] str = mList.toArray(new String[mList.size()]);
		
		for(String s : str)
			System.out.println(s);
	}
}

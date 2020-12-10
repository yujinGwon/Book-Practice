package arrays_asList;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
	public static void main(String[] args) {
		String[] strArr = {"축구", "야구", "달리기", "권투"};
		
		for(String s : strArr)
			System.out.println(s);
		
		List<String> listArr = Arrays.asList(strArr);
		// 아래처럼 컬렉션을 바로 출력할 수 없다.
		// for(List l : listArr) 오류발생
		// System.out.println(l); 오류 발생
		
		// 다음과 같이 get() 메소드를 사용하여 List 데이터를 출력한다.
		for (int i = 0; i < listArr.size(); i++)
			System.out.println(listArr.get(i));
	}
}

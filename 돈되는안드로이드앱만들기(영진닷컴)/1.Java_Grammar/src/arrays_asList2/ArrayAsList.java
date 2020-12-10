package arrays_asList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
	public static void main(String[] args) {
		String[] strArr = {"축구", "야구", "달리기", "권투"};
		
		List<String> listArr = Arrays.asList(strArr);

		// listArr.add("딸기"); // 오류 발생
		// 리스트에 데이터를 추가하기 위해서는 새로운 List 객체 필요
		List<String> listArr2 = new ArrayList<>(listArr);
		listArr2.add("수영");
		
		for (int i = 0; i < listArr2.size(); i++)
			System.out.println(listArr2.get(i));
	}
}

package arrays_asList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
	public static void main(String[] args) {
		String[] strArr = {"�౸", "�߱�", "�޸���", "����"};
		
		List<String> listArr = Arrays.asList(strArr);

		// listArr.add("����"); // ���� �߻�
		// ����Ʈ�� �����͸� �߰��ϱ� ���ؼ��� ���ο� List ��ü �ʿ�
		List<String> listArr2 = new ArrayList<>(listArr);
		listArr2.add("����");
		
		for (int i = 0; i < listArr2.size(); i++)
			System.out.println(listArr2.get(i));
	}
}

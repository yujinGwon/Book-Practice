package arrays_asList;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
	public static void main(String[] args) {
		String[] strArr = {"�౸", "�߱�", "�޸���", "����"};
		
		for(String s : strArr)
			System.out.println(s);
		
		List<String> listArr = Arrays.asList(strArr);
		// �Ʒ�ó�� �÷����� �ٷ� ����� �� ����.
		// for(List l : listArr) �����߻�
		// System.out.println(l); ���� �߻�
		
		// ������ ���� get() �޼ҵ带 ����Ͽ� List �����͸� ����Ѵ�.
		for (int i = 0; i < listArr.size(); i++)
			System.out.println(listArr.get(i));
	}
}

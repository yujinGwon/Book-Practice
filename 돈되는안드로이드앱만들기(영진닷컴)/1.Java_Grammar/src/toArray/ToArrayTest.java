package toArray;

import java.util.ArrayList;
import java.util.List;

public class ToArrayTest {
	public static void main(String[] args) {
		
		List<String> mList = new ArrayList<String>();
		// ArrayList<String> mList = new ArrayList<String>(); ��� �ص� �ȴ�.
		
		mList.add("����ö");
		mList.add("���ܺ�");
		mList.add("������");
		
		// for(List l : mList)
		//	System.out.println(l.get); �÷��� Ÿ���� ��Ʈ������ ����� �� ��� ������ ��
		// get() �޼ҵ带 ����Ͽ� List ������ ��� ����...
		
		/* for (int i = 0; i < mList.size(); i++)
			System.out.println(mList.get(i));
		*/
		
		
		String[] str = mList.toArray(new String[mList.size()]);
		
		for(String s : str)
			System.out.println(s);
	}
}

package stringGetBytes;

public class StringGetBytes {
	public static void main(String[] args) {
		String str = "�γ��� �ݼ��ϴ� ������ ������ " + "������ ������ �հ� ���� �� �ִ�.";
		byte[] mByte = str.getBytes();
		
		System.out.println(mByte);
		
		String str2 = new String(mByte);
		
		System.out.println(str2);
	
	}

}

package stringGetBytes;

public class StringGetBytes {
	public static void main(String[] args) {
		String str = "인내와 반성하는 마음만 있으면 " + "누구든 난관을 뚫고 나갈 수 있다.";
		byte[] mByte = str.getBytes();
		
		System.out.println(mByte);
		
		String str2 = new String(mByte);
		
		System.out.println(str2);
	
	}

}

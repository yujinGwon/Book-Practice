package inputStreamByte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;


public class InputStreamTest {
	public static void main(String[] args) throws IOException {
		int readByte;
		int count = 0;
		
		InputStream is = new FileInputStream("C:\\file\\test.txt");
		
		//byte mByte;
		byte[] mBytes = new byte[30];
		
		while((readByte = is.read(mBytes)) != -1) {
			count += 1;
			
			// System.out.print((char)readByte);
			// ����Ʈ �迭�� String���� ��ȯ�ϱ� ���� String �����ڿ� ����Ʈ �迭�� �ִ´�.
			String data = new String(mBytes, "US-ASCII");
			System.out.print(data);
		}
		System.out.println();
		
		System.out.println(count);
		is.close();
		
	}
}

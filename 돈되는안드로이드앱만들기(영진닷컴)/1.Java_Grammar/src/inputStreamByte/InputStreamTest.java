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
			// 바이트 배열을 String으로 변환하기 위해 String 생성자에 바이트 배열을 넣는다.
			String data = new String(mBytes, "US-ASCII");
			System.out.print(data);
		}
		System.out.println();
		
		System.out.println(count);
		is.close();
		
	}
}

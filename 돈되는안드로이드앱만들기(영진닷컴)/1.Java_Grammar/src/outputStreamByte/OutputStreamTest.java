package outputStreamByte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamTest {
	public static void main(String[] args) throws IOException {
		int count = 0; 
		OutputStream os = new FileOutputStream("C:\\file\\outputtest.txt");
		
		String s = "Good luck to you!";
		byte[] mByte = s.getBytes();
		
		for (int i = 0; i < mByte.length; i++) {
			os.write(mByte[i]);
			count += 1;
		}
		System.out.println(count);
		os.close();
	}
}

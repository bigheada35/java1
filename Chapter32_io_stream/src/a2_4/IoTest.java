package a2_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IoTest {

	public static void main(String[] args) {
		
		InputStream is = null;
		OutputStream os = null;
		
		
		try {
			
			is = new FileInputStream("C:\\Users\\swj\\eclipse-workspace\\java1\\Chapter32_io_stream\\src\\a2_4\\love2.txt");
			os = new FileOutputStream("C:\\Users\\swj\\eclipse-workspace\\java1\\Chapter32_io_stream\\src\\a2_4\\love3.txt");
			

			byte[] tmp = is.readAllBytes();
			os.write(tmp);
			

		} catch (Exception e) {
		
		}finally {
			
			try {
				if(is != null)
					is.close();
				if(os != null)
					os.close();
			} catch (Exception e2) {
				
			}

		}
		

	}

}

package a2_5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IoTest {

	public static void main(String[] args) {
		
		InputStream is = null;
		OutputStream os = null;
		OutputStream os2 = null;
		
		try {
			
			is = new FileInputStream("C:\\Users\\swj\\eclipse-workspace\\java1\\Chapter32_io_stream\\src\\a2_5\\love2.txt");
			os = new FileOutputStream("C:\\Users\\swj\\eclipse-workspace\\java1\\Chapter32_io_stream\\src\\a2_5\\love3.txt");
			
			//os2 = new FileOutputStream("love4.txt"); // 주의 : 이 파일은 프로젝트 디렉토리 밑에 생성이 된다.
			//os2 = new FileOutputStream("src\\a2_5\\love4.txt"); 
			//os2.close();

			//byte[] tmp = is.readAllBytes();
			//os.write(tmp);
			
			while(true) {
				int r = is.read();
				os.write(r);
				if(r == -1)
					break;
				
			}
			

		} catch (Exception e) {
			e.printStackTrace();
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

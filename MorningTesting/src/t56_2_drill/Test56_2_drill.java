package t56_2_drill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test56_2_drill {
	
	public static void main(String[] args) {
		OutputStream os = null;
		OutputStream os2 = null;
		InputStream is = null;
		String str = "좋은 아침 입니다.";
		
		try {
			os = new FileOutputStream("src\\t56_2_drill\\gm.txt");
			os.write(str.getBytes());

			is = new FileInputStream("src\\t56_2_drill\\gm.txt");

			byte[] buf = is.readAllBytes();

			os2 = new FileOutputStream("src\\t56_2_drill\\gm2.txt");
			os2.write(buf);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(os != null)	os.close();
				if(os2 != null) os2.close();
				if(is != null) is.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
}

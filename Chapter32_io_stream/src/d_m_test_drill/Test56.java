package d_m_test_drill;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test56 {

	public static void main(String[] args) {

			String str = "좋은 아침 입니다.";
			InputStream is = null;
			OutputStream os = null;
			OutputStream os2 = null;
			
		
			try {
				os = new FileOutputStream("src\\d_m_test_drill\\love.txt");
				os.write(str.getBytes());
				
				is = new FileInputStream("src\\\\d_m_test_drill\\\\love.txt");
				os2 = new FileOutputStream("src\\\\d_m_test_drill\\\\love2.txt");
				byte[] buf = is.readAllBytes();
				os2.write(buf);
			} catch (Exception e) {
				// TODO: handle exception
				

				
			}finally {
				try {
					if(os!=null)	os.close();
					if(is!=null)	is.close();
					if(os2!=null)	os2.close();
	
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
	}

}

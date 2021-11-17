package c_today_test3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test3 {

	public static void main(String[] args) {
		OutputStream os = null;
		InputStream is = null;
		OutputStream os2 = null;
		try {
			
			os = new FileOutputStream("src\\c_today_test3\\love.txt");
			
			String str = "좋은 아침 입니다.";
			byte[] ba = str.getBytes();
			os.write(ba);
			
			is = new FileInputStream("src\\c_today_test3\\love.txt");
			os2 = new FileOutputStream("src\\c_today_test3\\love2.txt");
			
			byte[] rallb = is.readAllBytes();
			os2.write(rallb);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(os!=null)
					os.close();
				if(is!=null)
					is.close();
				if(os2!=null)
					os2.close();
			} catch (Exception e2) {
				
			}
		}

	}

}
//좋은 아침 입니다. 를 love.txt 로 저장 -> 해당 내용을 읽어 들여 love2.txt 로 복사
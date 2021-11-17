package c_today_test3_teacher;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test3 {

	public static void main(String[] args) {
		IOCopy ioCopy = new IOCopy();
		ioCopy.saveWords("좋은 아침 입니다.");
		String src = "src\\c_today_test3_teacher\\love.txt";
		String dest = "src\\c_today_test3_teacher\\love2.txt";
		ioCopy.copyFile(src, dest);
	}

}
class IOCopy{
	public static final String FILE_NAME = "src\\c_today_test3_teacher\\love.txt";
	
	public boolean saveWords(String words) {
		
		boolean isDone = true;
		OutputStream os = null;
		
		try {
			os = new FileOutputStream(FILE_NAME);
						
			byte[] buffer = words.getBytes();
			
			os.write(buffer);
			
		} catch (Exception e) {
			isDone = false;
		}finally {
			try {
				if(os!=null)
					os.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		return isDone;
	}
	
	public boolean copyFile(String src, String des) {
		
		boolean isDone = true;
		
		OutputStream os = null;
		InputStream is = null;
		
		try {
			is = new FileInputStream(src);
			os 	= new FileOutputStream(des);
			
			byte[] buff = is.readAllBytes();
			
			os.write(buff);
			
		} catch (Exception e) {
			isDone = false;
			e.printStackTrace();
		}finally {
			try {
				if(is != null)
					is.close();
				if(os != null)
					os.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return isDone;
		
	}
	
}	

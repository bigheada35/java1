package a2_2;

import java.io.FileInputStream;
import java.io.InputStream;

public class IoTest {

	public static void main(String[] args) {
		
		InputStream is = null;
		
		try {// 주의 : 받드시 넣어야 함.try catch.

			is = new FileInputStream("C:\\Users\\swj\\eclipse-workspace\\java1\\Chapter32_io_stream\\src\\a2_2\\love.txt");
	
			while(true) {
				int i = is.read();
				System.out.println("데이터:" + i);
				if(i == -1)
					break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();// // 주의 : 반드시 넣어야 함.try catch.
			// 주의 : 다른 방법, -> throws Exception 을 추가
			// public static void main(String[] args) throws Exception{
			//
		}finally {
			try {
				if(is != null)
					is.close();
			}catch(Exception e) {
				
			}
		}
		
		//is.close();
		
		
		

	}

}

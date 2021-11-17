package a2_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IoTest {

	public static void main(String[] args) {
		
		OutputStream os = null;
		
		try {// 주의 : 받드시 넣어야 함. try catch.

			//os = new FileOutputStream("C:\\Users\\swj\\eclipse-workspace\\java1\\Chapter32_io_stream\\src\\a2_3\\love2.txt");
			os = new FileOutputStream("love3.txt");
			String str = "오늘 날씨는 아주 좋습니다.";
			
			byte[] bs = str.getBytes();
			os.write(bs);
		
		} catch (Exception e) {
			e.printStackTrace();// // 주의 : 반드시 넣어야 함.try catch.
			// 주의 : 다른 방법, -> throws Exception 을 추가
			// public static void main(String[] args) throws Exception{
			//
		}finally {//반드시 탄다.
			try {
				if(os != null)// 주의 : 꼭 넣기
					os.close();// 주의 :  꼭 넣기
			}catch(Exception e) {
				
			}
		}
		
		//os.close();
		
		
		

	}

}

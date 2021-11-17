package a2_6;

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
			
			is = new FileInputStream("src\\a2_6\\love2.txt");
			os = new FileOutputStream("src\\a2_6\\love3.txt");
			
			byte[] bs = new byte[5];//버퍼
			
			while(true) {
				
				int count = is.read(bs);// 5개 단위로 읽다가,   읽을것이 없으면 -1,    3개만 남았으면 3    을 리턴해 준다.
				System.out.println("count : " + count);
				if(count == -1)
					break;
				
				//os.write(bs);// 이렇게 하면  3개 남은 뒤 2개 공백도 들어 가 진다.
				os.write(bs, 0, count);// 주의 : 이렇게 하자
				
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

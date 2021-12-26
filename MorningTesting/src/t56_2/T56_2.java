package t56_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class T56_2 {

	public static void main(String[] args) {
		
		FileOutputStream os = null;
		FileOutputStream os2 = null;
		FileInputStream is = null;
		String str = "좋은 아침 입니다.";
		
		try {
					os = new FileOutputStream("src\\t56_2\\good.txt");
					os.write(str.getBytes());
					
					is = new FileInputStream("src\\t56_2\\good.txt");
					byte[] buf = is.readAllBytes();
					
					os2 = new FileOutputStream("src\\t56_2\\good2.txt");
					os2.write(buf);
			
					
					
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			try {
				if(os !=null) os.close();
				if(os2 !=null) os2.close();
				if(is != null) is.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		
	}

}

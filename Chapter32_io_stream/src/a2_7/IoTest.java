package a2_7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IoTest {

	public static void main(String[] args) {


		
		try {
			
			//필터 스트림을 장착하는 방법
			OutputStream os = new FileOutputStream("src\\a2_7\\temp.bin");
			DataOutputStream dos = new DataOutputStream(os); // 보조 스트림,  		
			
			
			dos.writeUTF("데이터스트림");
			dos.writeDouble(11.5);//  
			dos.writeInt(3);
			
			dos.flush();
			dos.close();

			InputStream is = new FileInputStream("src\\a2_7\\temp.bin");
			DataInputStream dis = new DataInputStream(is);
			
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			
			System.out.println(name + ": " + score + ": " + order);
			dis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
		
			} catch (Exception e2) {
				
			}

		}
		

	}

}

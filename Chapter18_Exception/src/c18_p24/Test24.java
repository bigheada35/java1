
package c18_p24;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Test24 {
	public static void main(String[] args) {

		//Path file = Paths.get("C:\\javastudy\\Simple.txt");
		Path file = Paths.get("C:\\Users\\kosmo\\eclipse-workspace-ssj2\\javastudy\\Simple.txt");
		//Path file = Paths.get("C:\\javastudy\\Simple.txt");
		
		   BufferedWriter writer = null;

		  try {
		      writer = Files.newBufferedWriter(file);   // IOException 발생 가능
		      // 에러 : Invalid character constant --> import 필요
		      writer.write('A');   // IOException 발생 가능
		      writer.write('Z');   // IOException 발생 가능

		      if(writer != null)
		          writer.close();   // IOException 발생 가능
		   }
		   catch(IOException e) {
			   				//Exception을 상속하는 예외는 반드시 처리를 해야 한다. 
			   				//그렇지 않으면 컴파일 오류로 이어진다. 
		      e.printStackTrace();
		   }
		
		
	}
}

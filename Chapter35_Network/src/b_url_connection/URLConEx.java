package b_url_connection;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;


public class URLConEx {

	public URLConEx() {
		
		String code = null;
		System.out.println("웹 주소를 입력 하세요..");
		Scanner scanner = new Scanner(System.in);
		String address = scanner.next();
		
		try {
			URL url = new URL(address);
			URLConnection con = url.openConnection();
			BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
			//FileWriter fw = new FileWriter("C:\\javalec\\workspace\\file.html", false);
			FileWriter fw = new FileWriter("src\\b_url_connection\\file2.html", false);
			
			while ((code = webData.readLine()) != null) {
				fw.write(code);
			}
			System.out.println("The End");
			 
			fw.close();
			webData.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

/*
	웹 주소를 입력 하세요..
	http://www.google.com
	The End
	
	입력 :  http://www.google.com
	결과 : src\\b_url_connection\\file.html  파일이 생성
	
	동작 설명  :  http://www.google.com
				에 접속을 해서, 
				거기에서 읽어온 데이터를 
				( 새로 file.html 파일을 만든 뒤에 )
				file.html 에 저장을 한다.
				
	
	
	
*/
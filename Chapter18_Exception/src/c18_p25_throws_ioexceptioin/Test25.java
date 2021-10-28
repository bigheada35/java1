package c18_p25_throws_ioexceptioin;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Test25{
public static void main(String[] args) {
	   try {
		      md1();
		   }
		   catch(IOException e) {
		      e.printStackTrace();
		   }
	}


	public static void md1() throws IOException {    // IOException 예외 넘긴다고 명시!
	    md2();
	}
	
	public static void md2() throws IOException {    // IOException 예외 넘긴다고 명시!
	   //Path file = Paths.get("C:\\javastudy\\Simple.txt");
		Path file = Paths.get("C:\\Users\\kosmo\\eclipse-workspace-ssj2\\javastudy\\Simple.txt");
		
	   BufferedWriter writer = null;
	   writer = Files.newBufferedWriter(file);   // IOException 발생 가능
	   writer.write('A');   // IOException 발생 가능
	   writer.write('Z');   // IOException 발생 가능
	   
	   if(writer != null)
	      writer.close();   // IOException 발생 가능
	}


	
}
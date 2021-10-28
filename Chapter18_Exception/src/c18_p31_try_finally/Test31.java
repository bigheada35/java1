package c18_p31_try_finally;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Test31{
public static void main(String[] args) {
	   Path file = Paths.get("C:\\javastudy\\Simple.txt");
		//Path file = Paths.get("C:\\Users\\kosmo\\eclipse-workspace-ssj2\\javastudy\\Simple.txt");
		
	   BufferedWriter writer = null;   
	   try {
		   
	      writer = Files.newBufferedWriter(file);   // IOException 발생 가능
	      writer.write('A');   // IOException 발생 가능
	   }
	   catch(IOException e) {
		   
	      e.printStackTrace();
	   }
	   
	   finally {
		   
	      try {
	    	  System.out.println("---2-");
	         if(writer != null)
	        	 System.out.println("--3--");
	             writer.close();    // IOException 발생 가능
	      }
	      catch(IOException e) {
	         e.printStackTrace();
	      }   
	   }
	   
	}	   

}


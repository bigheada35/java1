package c18_p08_try_catch2;

import java.util.InputMismatchException;//<--- 있어야 에러 안남
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		   Scanner kb = new Scanner(System.in);
		   
		   try {
			   System.out.print("a/b...a? ");
			   int n1 = kb.nextInt();    // int형 정수 입력
	
			   System.out.print("a/b...b? ");
			   
			   int n2 = kb.nextInt();    // int형 정수 입력
			   //int n2=0;
			   //String n3 = kb.next();    // int형 정수 입력
	
			   System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
			   
			   
		   }
	
		   //
		   // 에러 : No exception of type Object can be thrown; 
		   //       an exception type must be a subclass of Throwable
		   // 해결:
		   //		import java.util.InputMismatchException; 추가
		   //
		   catch( ArithmeticException | InputMismatchException e) {
	
			   System.out.println("에러입니다.");
			   System.out.println(e.getMessage());
		   }
		   
		   System.out.println("Good bye~~!");

	}

}

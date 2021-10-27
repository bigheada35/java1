package c18_p08_try_catch;

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
		   catch(Exception e) {
			   /*
			    catch(Exception e) { 
			    사용시 결과 : 
				   			a/b...a? 1
						   a/b...b? ㄱ
						   에러입니다.
						   null
						   Good bye~~!
			    */

		   // 주의 : Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
		   //catch(ArithmeticException e) {
			   /*
			    catch(ArithmeticException e) { 
			    사용시  결과 : 
						    Exception in thread "main" java.util.InputMismatchException
							at java.base/java.util.Scanner.throwFor(Scanner.java:939)
							at java.base/java.util.Scanner.next(Scanner.java:1594)
							at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
							at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
							at c18_p08_try_catch.Test.main(Test.java:17)

			    */
			   
			   //test
			   e.printStackTrace();
			   /*
			     e.printStackTrace();
			     사용시 결과 : 
						    a/b...a? 1
							a/b...b? 0
							java.lang.ArithmeticException: / by zero
								at c18_p08_try_catch.Test.main(Test.java:21)
							에러입니다.
							/ by zero
							Good bye~~!

			    */
			   
			   System.out.println("에러입니다.");
			   System.out.println(e.getMessage());
		   }
		   
		   System.out.println("Good bye~~!");

	}

}

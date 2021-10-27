package c18_p04;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		   Scanner kb = new Scanner(System.in);

		   System.out.print("a/b...a? ");
		   int n1 = kb.nextInt();    // int형 정수 입력

		   System.out.print("a/b...b? ");
		   
		   //int n2 = kb.nextInt();    // int형 정수 입력
		   int n2=0;
		   String n3 = kb.next();    // int형 정수 입력

		   System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
		   System.out.println("Good bye~~!");
	}
}

/*
	a/b...a? 1
	a/b...b? 0
	
	Exception in thread "main" java.lang.ArithmeticException: / by zero
		at c18_p04.Test.main(Test.java:17)

 */

/*
	a/b...a? 1
	a/b...b? R
	Exception in thread "main" java.util.InputMismatchException
		at java.base/java.util.Scanner.throwFor(Scanner.java:939)
		at java.base/java.util.Scanner.next(Scanner.java:1594)
		at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
		at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
		at c18_p04.Test.main(Test.java:15)

*/
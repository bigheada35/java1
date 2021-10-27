package c18_p16_array_index_out_of_bounds_exception;

import java.util.Scanner;

//예외 발생 지점에서 예외를 처리하지 않으면 해당 메소드를 호출한 영역으로 예외가 전달된다.


public class Test {


	
	
	public static void md1(int n) {
		md2(n, 0); // 아래의 메소드 호출
	}

	public static void md2(int n1, int n2) {
		int r = n1 / n2; // 예외 발생 지점
	}
	
	public static void main(String[] args) {
		try {
			md1(3);  // 이 지점에서 md1으로부터 예외가 넘어온다
			
		}
	     catch(Throwable e) {
	         e.printStackTrace();
	     }
	      System.out.println("Good bye~~!");


	}
	
}
/*
 실행결과:
java.lang.ArithmeticException: / by zero
	at c18_p15_printStackTrace.Test.md2(Test.java:18)
	at c18_p15_printStackTrace.Test.md1(Test.java:14)
	at c18_p15_printStackTrace.Test.main(Test.java:23)
Good bye~~!
 */



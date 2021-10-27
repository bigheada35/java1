package c18_p14_excep;

import java.util.Scanner;

//예외 발생 지점에서 예외를 처리하지 않으면 해당 메소드를 호출한 영역으로 예외가 전달된다.


public class Test {

	public static void main(String[] args) {
	
		md1(3);
		System.out.println("Good bye~~!");
	

	}
	
	
	public static void md1(int n) {
		md2(n, 0); // 아래의 메소드 호출
	}

	public static void md2(int n1, int n2) {
		int r = n1 / n2; // 예외 발생 지점
	}
	
	
}
/*
 실행결과:
 Exception in thread "main" java.lang.ArithmeticException: / by zero
	at c18_p14_excep.Test.md2(Test.java:24)
	at c18_p14_excep.Test.md1(Test.java:20)
	at c18_p14_excep.Test.main(Test.java:12)

 */



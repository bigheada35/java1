package c18_p15_printStackTrace;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
	      int[] arr = {1, 2, 3};
	      
	      for(int i = 0; i < 4; i++)
	         System.out.println(arr[i]);  // 인덱스 값 3은 예외를 발생시킴
	}
	
}
/*
 실행결과:
		1
		2
		3
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
			at c18_p15_printStackTrace.Test.main(Test.java:12)

 */



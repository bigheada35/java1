package c18_p18_null_pointer_exception;
public class Test22 {
	public static void main(String[] args) {
		String str = null;
	      System.out.println(str);   // null 출력
	      // 주의 : 이경우 exception임, 0 이 넘어 오지 않나봐.? 
	      int len = str.length();   // Exception!
	}
}

/*
 실행결과:
null
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
	at c18_p18_null_pointer_exception.Test22.main(Test22.java:6)

 */



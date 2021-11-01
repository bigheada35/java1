package ch20_p12_staic_method;
//래퍼 클래스의 다양한 static 메소드들
//static
//static
//static
public class Prog {
	public static void main(String[] args) {
		// 클래스 메소드를 통한 인스턴스 생성 방법 두 가지
		   Integer n1 = Integer.valueOf(5);   // 숫자 기반 Integer 인스턴스 생성
		   Integer n2 = Integer.valueOf("1024");   // 문자열 기반 Integer 인스턴스 생성
		   System.out.println("---> " + n1 + "," + n2);
		   
		// 대소 비교와 합을 계산하는 클래스 메소드
		   System.out.println("큰 수: " + Integer.max(n1, n2));
		   System.out.println("작은 수: " + Integer.min(n1, n2));
		   System.out.println("합: " + Integer.sum(n1, n2));
		   System.out.println();
		   
		   // 정수에 대한 2진, 8진, 16진수 표현 결과를 반환하는 클래스 메소드
		   System.out.println("12의 2진 표현: " + Integer.toBinaryString(12));
		   System.out.println("12의 8진 표현: " + Integer.toOctalString(12));
		   System.out.println("12의 16진 표현: " + Integer.toHexString(12));
		   
		   System.out.println("---");
		   String s1 = String.valueOf(false);	System.out.println(s1);		   
		   String s2 = String.valueOf(5);	System.out.println(s2);
		   String s3 = String.valueOf(5.0);	System.out.println(s3);
		   
		   System.out.println(Integer.MAX_VALUE);
		   System.out.println(Integer.MIN_VALUE);
/*
   결과:
	   큰 수: 1024
	   작은 수: 5
	   합: 1029

	   12의 2진 표현: 1100
	   12의 8진 표현: 14
	   12의 16진 표현: c
 */
		   
		   
	}
}

package ch20_p15;

import java.math.BigDecimal;// <-- * 


//오차 없는 실수 표현 위한 BigDecimal 클래스
public class Prog {
	public static void main(String[] args) {
			BigDecimal d1 = new BigDecimal("1.6");
			BigDecimal d2 = new BigDecimal("0.1");
		   System.out.println("덧셈 결과: " + d1.add(d2));
		   System.out.println("곱셈 결과: " + d1.multiply(d2));

/*
		덧셈 결과: 1.7
		곱셈 결과: 0.16
 */
	   
	}
}

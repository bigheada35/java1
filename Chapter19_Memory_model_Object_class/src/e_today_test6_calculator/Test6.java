package e_today_test6_calculator;

/*
6. 사칙연산 계산기를 아래의 조건으로 짜시오.
 
결과: 
	================================================
	11
	1
	30
	java.lang.ArithmeticException: / by zero
		at Calculator.div(CalculatorMain.java:32)
		at CalculatorMain.main(CalculatorMain.java:45)
	계산기 종료

 */

public class Test6 {

	public static void main(String[] args) {

		ICalculator cal = new Calculator();

		//출력결과 참고 하여 try catch 를 적절히 넣을것  
			System.out.println(cal.add(6, 5));
			System.out.println(cal.sub(6, 5));	
			System.out.println(cal.mul(6, 5));	
			System.out.println(cal.div(6, 0));
	}

}

interface ICalculator {
	int add(int x, int y);
	int sub(int x, int y);
	int mul(int x, int y);
	int div(int x, int y);
}

class Calculator implements ICalculator{
	
	public int add(int x, int y){
		return x+y;
	}
	public int sub(int x, int y){
		return x-y;
	}
	public int mul(int x, int y){
		return x*y;
	}
	
	public int div(int x, int y){
		int div=0;
		try {
			div = x/y;
		}
		//catch(Throwable e) {
		catch(Exception e) {
			e.printStackTrace();
			
			// test  
				//	catch(Exception e) {  <-- 사용시
				//	System.out.println(e.getMessage()); <-- 사용시 
				//	/ by zero		<--결과 : 만 나온다.
			
			System.out.println("계산기 종료");
		}
		return div;
	}

}
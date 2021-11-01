package g_today_test6_calculator_teacher;

/*
6. 사칙연산 계산기를 아래의 조건으로 짜시오.
 
결과: 
	================================================
	11
	1
	30
	java.lang.ArithmeticException: / by zero
		at Calculator.res(CalculatorMain.java:32)
		at CalculatorMain.main(CalculatorMain.java:45)
	계산기 종료

 */

public class Test6 {

	public static void main(String[] args) {

		ICalculator cal = new Calculator();

		//출력결과 참고 하여 try catch 를 적절히 넣을것
		try {
			System.out.println(cal.add(6, 5));
			System.out.println(cal.sub(6, 5));	
			System.out.println(cal.mul(6, 5));	
			System.out.println(cal.div(6, 0));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("종료입니다.");
		}
	}

}

interface ICalculator {

		int add(int x, int y);
		int sub(int x, int y);
		int mul(int x, int y);
		int div(int x, int y);

}

class Calculator implements ICalculator{
	
	@Override
	public int add(int x, int y){
		return x+y;
	}
	@Override
	public int sub(int x, int y){
		return x-y;
	}
	@Override
	public int mul(int x, int y){
		return x*y;
	}
	@Override
	public int div(int x, int y){
		return x/y;
	}

}

public class TestOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		11 이 1초과 100 미만의 숫자인가?
//			22 가 2의 배수 또는 3의 배수 숫자인가 ?
//				위의 결과를 나타내시오.true false 로
		
		int num1 = 11;
		int num2 = 22;
		boolean result = ( 1< num1  &&  num1 < 100);
		System.out.println("11 이 1초과 100 미만의 숫자인가? : " + result);
		
		result = ( (num2 % 2 == 0 ) || (num2 % 3 == 0) ); 
		System.out.println("22 가 2의 배수 또는 3의 배수 숫자인가 ? : " + result);
	}

}

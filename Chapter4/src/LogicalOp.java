
public class LogicalOp {

	public static void main(String[] args) {
		//
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		//변수 num1에 저장된 값이 1과 100 사이의 수인가?
		result = (1<num1) && (num1 < 100);
		System.out.println("1초과 100 미만인가" + result);
		
		//변수 num2 에 저장된 값이 2 또는 3의 배수인가?
		result = ((num2 % 2) == 0) || ((num2 % 3)== 0);
		System.out.println("2또는 3의 배수인가?" + result);
		
		//변수 num1이 0 인가?
		result = !(num1 != 0);
		System.out.println("0 이가?" + result);
		
		System.out.println(3147483647L);
		
//		System.out.println("3>=2 :" + (3>=2));
//		System.out.println(" 3<= 2 : " + (3<=2));
//		System.out.println("7.0 == 7 : "+ (7.0 == 7));
//		System.out.println("7.0 != 7 : " + (7.0 !=7));
		
		
		int a = 3;
		int b = 4;
		double result_5 = a/b;
		System.out.println("result_5 is : " +  result_5);
		
		System.out.println('A'); 
		System.out.println('A' + 'A');
		System.out.println("A"+ "A");
		System.out.println( 3 + 4);
		System.out.println("----------" + 3 + 4);
		
		int num = 99;
		boolean result_6 = false;
		result_6 = ((num % 2 == 0) || (num % 3 == 0));
		System.out.println("2의 배수 또는 3의 배수? : " +  result_6);

		//int num = 11;
		boolean result_7 = false;
		result_7 = ( ( 1 < num ) && ( num < 100));
		System.out.println("1초과 100미만인가? : " +  result_7);
	}

}

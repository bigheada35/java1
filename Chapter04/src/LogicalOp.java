
public class LogicalOp {

	public static void main(String[] args) {
		//
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		//���� num1�� ����� ���� 1�� 100 ������ ���ΰ�?
		result = (1<num1) && (num1 < 100);
		System.out.println("1�ʰ� 100 �̸��ΰ�" + result);
		
		//���� num2 �� ����� ���� 2 �Ǵ� 3�� ����ΰ�?
		result = ((num2 % 2) == 0) || ((num2 % 3)== 0);
		System.out.println("2�Ǵ� 3�� ����ΰ�?" + result);
		
		//���� num1�� 0 �ΰ�?
		result = !(num1 != 0);
		System.out.println("0 �̰�?" + result);
		
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
		System.out.println("2�� ��� �Ǵ� 3�� ���? : " +  result_6);

		//int num = 11;
		boolean result_7 = false;
		result_7 = ( ( 1 < num ) && ( num < 100));
		System.out.println("1�ʰ� 100�̸��ΰ�? : " +  result_7);
	}

}

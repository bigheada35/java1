
public class TestOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		11 �� 1�ʰ� 100 �̸��� �����ΰ�?
//			22 �� 2�� ��� �Ǵ� 3�� ��� �����ΰ� ?
//				���� ����� ��Ÿ���ÿ�.true false ��
		
		int num1 = 11;
		int num2 = 22;
		boolean result = ( 1< num1  &&  num1 < 100);
		System.out.println("11 �� 1�ʰ� 100 �̸��� �����ΰ�? : " + result);
		
		result = ( (num2 % 2 == 0 ) || (num2 % 3 == 0) ); 
		System.out.println("22 �� 2�� ��� �Ǵ� 3�� ��� �����ΰ� ? : " + result);
	}

}

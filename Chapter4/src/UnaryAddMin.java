
public class UnaryAddMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num1 = 5;
		System.out.println(+num1);
		System.out.println(-num1);
		
		short num2 = 7;
		int num21 = +num2;
		short num3 = (short)(+num2); //�� ��ȯ ���� ������ ���� �߻��ȴ�.
		//short num3 = (+num2); // �̷��� ���� �����߻�,  +num2 ��  int�� �Ǿ������
		
		short num4 = (short)(-num2);
		System.out.println(num3);
		System.out.println(num4);
	}

}

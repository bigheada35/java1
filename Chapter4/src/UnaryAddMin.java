
public class UnaryAddMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num1 = 5;
		System.out.println(+num1);
		System.out.println(-num1);
		
		short num2 = 7;
		int num21 = +num2;
		short num3 = (short)(+num2); //형 변환 하지 않으면 오류 발생된다.
		//short num3 = (+num2); // 이렇게 쓰면 오류발생,  +num2 는  int가 되어버린것
		
		short num4 = (short)(-num2);
		System.out.println(num3);
		System.out.println(num4);
	}

}

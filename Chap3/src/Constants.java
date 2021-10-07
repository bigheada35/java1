
public class Constants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '상';
		final int CONST_ASSIGNED;
		CONST_ASSIGNED = 12;//상수 선언의 예 초기화 하지 않으면 딱 한번 초기화 가능하다
		//CONST_ASSIGNED = 11; //final 인 경우에는 초기화 된 뒤에 다시, 할당은 불가능하다.
		
		System.out.println("상수1  "+ MAX_SIZE);
		System.out.println("상수2  "+ CONST_CHAR);
		System.out.println("상수2  "+ CONST_ASSIGNED);
		System.out.println();
	}

}

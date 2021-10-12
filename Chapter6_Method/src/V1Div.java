
public class V1Div {

	public static void main(String[] args) {

		divide(4,2);
		divide(6,2);
		divide(9,0);
		
		divide(10,3);
		divide(10,4);
		divide(10,5);
		
	}
	
	public static void divide(int num1, int num2) {
		
		if(num2 == 0) {
			System.out.println("0 으로 나눌 수 없습니다.");
					//  return의 두가지 의미에서 2번째 
			return ; //값의 반환 없이 메소드만 종료
		}
		
		System.out.println("나눗셈 결과 : " + (num1 / (float)num2 ));
		
	}
	
	

	







	
}

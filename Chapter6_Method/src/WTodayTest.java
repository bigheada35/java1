
public class WTodayTest {

	public static void main(String[] args) {
		/*
		 * 
		 * 4. 아래의 함수를 펙토리얼로 표현하시오
System.out.println("3 factorial: " + factorial(3));
System.out.println("3 factorial: " + factorial(12));
		 */
		System.out.println("3 factorial: " + factorial(3));
		System.out.println("3 factorial: " + factorial(12));
	}
	
	public static int factorial(int n) {
		if(n==1)
			return 1;
		
		return n * factorial(n-1); 
	}

}

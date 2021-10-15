import java.util.Scanner;
public class ScanerTest2CircleArea {

	public static void main(String[] args) {
		
		System.out.println("반지름을 입력 하세요.");
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 참고 : 스트링을 받을때는 
		 * String s1 = sc.next();
		 */
		
	
		int r = sc.nextInt();
		System.out.println(r);
		
		
		//test1
		//System.out.println(getArea(r));
		
		//test2
		Circle cr = new Circle(r);
		System.out.println("넓이:");
		System.out.println(cr.getArea()); 

		//test3
		System.out.println("원둘레:");
		System.out.println(cr.circumference());
		
	}
	
	static double getArea(int r) {
		//주의 : 
		//  	static main에서 
		// 		인스턴스 안만들고 호출 해서 사용할 것이니깐
		// 			꼭
		// 		static을 붙여줘야 함.
		//
	//double getArea(int r) {
		final double PI=3.14;
		return r*r*PI;
	}

}





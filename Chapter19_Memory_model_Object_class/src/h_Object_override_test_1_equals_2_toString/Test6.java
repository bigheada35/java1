package h_Object_override_test_1_equals_2_toString;

/*

다음 main()이 실행이 되면, 아래 예시와 같이 출력되도록 MyPoint클래스를 작성하라.

public static void main(String [] args) {
	MyPoint p = new MyPoint(3, 50);
	MyPoint q = new MyPoint(4, 50);

	System.out.println(p);

	if(p.equals(q)) 
		System.out.println("같은 점");
	else 
                  System.out.println("다른 점");			
}


결과:
Point(3,50)
다른점
 */

public class Test6 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		//MyPoint q = new MyPoint(3, 50);

		System.out.println(p);

		if(p.equals(q)) 
			System.out.println("같은 점");
		else 
	        System.out.println("다른 점");
	}

}

class MyPoint{
	private int x, y;
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		if((this.x == ((MyPoint)obj).x) && (this.y == ((MyPoint)obj).y)) {
			return true;
		}else
			return false;
	}
	@Override
	public String toString() {
		return ("Point(" + x +","+y +")");
	}
}


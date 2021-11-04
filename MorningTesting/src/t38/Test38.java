package t38;


/*
Object obj = new Circle(10);
System.out.println(obj);

//출력: 넓이는 314.34423 입니다. (예시)

*/

public class Test38 {
	public static void main(String[] args) {
		Object obj = new Circle(10);
		System.out.println(obj);
	}
}

class Circle{
	private final double PI = 3.14;
	private int r;
	Circle(int r){
		this.r = r;
	}
	@Override
	public String toString() {
		//return ("넓이는 " + this.r*this.r*Math.PI + " 입니다.");
		return ("넓이는 " + r*r*PI + " 입니다.");
	}
}

/*결과:
 넓이는 314.1592653589793 입니다.
 */

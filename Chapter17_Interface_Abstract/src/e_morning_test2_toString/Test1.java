package e_morning_test2_toString;


public class Test1 {
	public static void main(String[] args) {
		
		Object obj = new Circle(10);
		System.out.println(obj);

		//출력: 넓이는 314.34423 입니다. (예시)
	}
}

class Circle{
	private double r;
	Circle(double r){
		this.r = r;
	}
	
	// 주의 :  이거 아님
//	public void toString(String obj) {
//		System.out.println("출력: 넓이는 " + r*r*Math.PI + "입니다.");
//	}

	// 주의 : 이거 아님
//	public String toString(String obj) {
//	return "출력: 넓이는 " + r*r*Math.PI + "입니다.";
	
	//
	// 주의:  이것임,
	//
	// 입력 : void
	// 리턴 : String 
	public String toString() {
		return "넓이는 " + r*r*Math.PI + "입니다.";
}
}
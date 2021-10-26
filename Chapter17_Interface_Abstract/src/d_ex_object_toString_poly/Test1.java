package d_ex_object_toString_poly;

public class Test1 {
	public static void main(String[] args) {
		Object obj = new Circle(10);
		System.out.println(obj);
	}
}
//
// 주의 : 기본적으로 Circle extends Object 임. 
//		(extends Object 은 컴파일러가 자동으로 넣어줌)
//      모든 객체의 최고 조상은 Object 임.
//
class Circle{
	private int r;
	Circle(int r){
		this.r = r;
	}
	//
	//  주의 : @Override 붙여서 사용하기 습관, 꼭 앞에 public 붙이기
	//
	@Override
	public String toString() {
		return "출력:넓이는" + r*r*Math.PI + "입니다.";
	}
}

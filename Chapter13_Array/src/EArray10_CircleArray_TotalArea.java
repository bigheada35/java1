
/*
 Circle을 배열로 5개 선언
 해당 객체에 인덱스 순서대로 반지름 설정
 해당 배열에 있는 Circle의 총넓이의 합을 구하시요
 */

public class EArray10_CircleArray_TotalArea {

	public static void main(String[] args) {
		Circle[] cr = new Circle[5];
		double totalArea = 0;
		
		for(int i=0; i<cr.length; i++) {
			cr[i] = new  Circle( i + 1);
			totalArea += cr[i].Area();
			System.out.println( cr[i].getRadius() + " , " + cr[i].Area());
		}
		
		System.out.println("배열 서클 총넓이의 합 : "+totalArea);
		
		

		// test : 
		// 파라미터를 Circle 배열로 받아서 해당 배열에 들어있는 Circle들에 총 넓이를 리턴하는 함수를 만드시오.
		
		//  방법 1 , static double TotalArea(Circle[] cir) 로 만들고, 클래스 함수로 호출 방법?
		
		// 	방법 1 , cr[0].TotalArea(cr)
		
		System.out.println("배열 서클 총넓이의 합 : "+ Circle.TotalArea(cr));
		
		System.out.println("배열 서클 총넓이의 합 : "+ cr[0].TotalArea(cr));
	}
}


class Circle{
	private int radius;
	static final double PI = Math.PI;
	//private double totalArea;
	
	Circle(int radius){
		this.radius = radius;
	}
	int getRadius() {
		return radius;
	}
	
	double Area() {
		return radius*radius*PI;
	}
	/*
	 파라미터를 Circle배열로 받아서 해당 배열에 들어있는 Circle들에
	 총 넓이를 리턴하는 함수를 만드시오.
	 */
	static double TotalArea(Circle[] cir) {
	//double TotalArea(Circle[] cir) {
		double totalArea = 0;
		for(int i=0; i<cir.length; i++) {
			totalArea += cir[i].Area();
		}
		return totalArea;
	}
}



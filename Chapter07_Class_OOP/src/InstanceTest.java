class A2{
	int num=5;
	public void printNum() {
		System.out.println(num);
	}
	public double Area() {
		return num*num*Math.PI;
	}
}

class Circle2{
	int radius;
//	public Circle(int r){
//		radius = 1;
//	}
//	public double getArea(){
//		return radius*radius*3.14;
//	}
	
	public void setRadius(int r) {
		radius = r;
	}
	public int getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
}


public class InstanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Circle cir = new Circle(1);
//		double ca = cir.getArea();
//		System.out.println("ca : "+ ca);
		System.out.println("--test--");
		System.out.println("----t1---");	
		Circle circle = new Circle();
		
		circle.setRadius(10);
		
		int radius = circle.getRadius();
		System.out.println("radius: "+ radius);
		System.out.println(circle.getRadius());
	
		double area = circle.getArea();
		System.out.println("area : " + area);
		System.out.println("----t2---");
		A2 a = new A2();
		double  area2 = a.Area();
		System.out.println("arda:" + area2);
		
	}

}

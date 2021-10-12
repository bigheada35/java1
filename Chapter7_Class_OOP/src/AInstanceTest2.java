class A{
	int num=5;
	public void printNum() {
		System.out.println(num);
	}
	public double Area() {
		return num*num*Math.PI;
	}
}

class Circle{
	int radius;

	
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


public class AInstanceTest2 {

	public static void main(String[] args) {

		

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
		A a = new A();
		double  area2 = a.Area();
		System.out.println("arda:" + area);
		
	}

}

package c15.polymorphism4;
public class c15_Polytest4 {

	public static void main(String[] args) {
		Shape[] arr = { new Circle(10), new Rectangle(2,3), new Triangle(2,3)};
		double sum = 0;
		for (Shape e : arr) {
			sum += e.getArea();
		}
		System.out.println("sum:"+ sum);
	}
	

}

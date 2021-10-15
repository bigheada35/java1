class Circle{
	int radius;
	public double getArea(){
		//System.out.println("radius:"+ radius);
		if(radius == 0) {
			System.out.println("-err-");
			return 0;
		}
		return radius * radius * Math.PI;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		

		this.radius = radius;
	}
	
}
class Rectangle{
	int width;
	int height;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		return width*height;
	}
}
public class AreaTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Circle circle = new Circle();
		double area;
		//
		circle.setRadius(10);
		area  = circle.getArea();
		System.out.println("cir : "+ area);
		//
		circle.setRadius(20);
		area  = circle.getArea();
		System.out.println("cir : "+ area);
		
		//
		Rectangle rec = new Rectangle();
		rec.setWidth(10);
		rec.setHeight(10);
		System.out.println("rec : " + rec.getArea());
		
	}

}

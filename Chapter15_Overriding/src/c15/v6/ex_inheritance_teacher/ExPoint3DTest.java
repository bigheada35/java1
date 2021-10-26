package c15.v6.ex_inheritance_teacher;

public class ExPoint3DTest {

	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z축의 값.
		System.out.println(p.toString()+"입니다.");
		p.moveUp(); // z 축으로 위쪽 이동
		System.out.println(p.toString()+"입니다.");
		p.moveDown(); // z 축으로 아래쪽 이동
		p.move(10, 10); // x, y 축으로 이동
		System.out.println(p.toString()+"입니다.");
		p.move(100,  200, 300); // x, y, z축으로 이동
		System.out.println(p.toString()+"입니다.");
	}
}

class Point {
	private int x, y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) { 
		this.move(x, y);  
	}

	public int getX() { 
		return x; 
	}
	
	public int getY() { 
		return y; 
	}
	
	protected void move(int x, int y) {
		this.x =x; 						
		this.y = y;    					
	}
}

class Point3D extends Point{
	private int z;
	Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	void moveUp() {
		z++;
	}
	void moveDown() {
		this.z--;
	}

	//  주의 : 꼭  public 으로 사용, 리턴은 꼭 String으로
	public String toString() {
		//return  ("(" + super.getX() +","+ super.getY() +","+ this.z + ")");
		//
		// 주의 : super를 안붙여도 됨. 상속받았으므로,
		//
		return  ("(" + getX() +","+ getY() +","+ this.z + ")");
	}
	
	void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;    					
	}
	
}

class ColorPoint extends Point{
	private String color = "BLACK";   
	
	public ColorPoint() {
		
	}
	
	public ColorPoint(int x, int y, String color) { 
		super(x, y);
		this.color = color;
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
	}
	
	public void setXY(int x, int y) {
		super.move(x, y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return color + "색의 ("+ super.getX()+", "+ super.getY()+")의 점";
	}
}
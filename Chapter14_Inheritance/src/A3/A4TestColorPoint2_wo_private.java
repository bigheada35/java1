package A3;

/*
 * 			77 문제
 * 

 1.
2차원 상의 한 점을 표현하는 Point 클래스
Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라.

class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x =x; this.y = y; }

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다. ");
}


=======================
RED색의 (10,20)의 점입니다.

*/



public class A4TestColorPoint2_wo_private {

	public static void main(String[] args) {
		ColorPoint2 cp = new ColorPoint2(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다. ");
	}

}
 
class Point2{
		
		// 
		//  TEST wo private
		//
		//private int x;
		int x;
		
		private int y;
		Point2(int x, int y){
			this.x = x;
			this.y = y;
		}
		public int getX() { return x; }
		public int getY() { return y; }
		protected void move(int x, int y) { this.x =x; this.y = y; }
		
		void setXY(int x, int y){
			this.x = x;
			this.y = y;
		}
}
 
class ColorPoint2 extends Point2{
	private String color;
	
	ColorPoint2(int x, int y, String color){
		super(x,y);
		this.color = color;
	}

	void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		//
		// super.x 억세스가 않되는 이유는 private int x 로 되어 있으므로,
		// 그래서, getX() 를 사용해야 한다.
		//
		
		//
		//	TEST wo private
		//
		//String str = color + "색의 (" + getX() +","+ getY() + ")의 점 ";
		String str = color + "색의 (" + super.x +","+ getY() + ")의 점 ";
		
		return str;
	}
}
 





public class TTodayTest6 {

	public static void main(String[] args) {
		getRecArea(3,5); //사각형 넓이
		getRecCirlce(5); //원넓이
		getTriangleArea(4 , 5); //삼각형 넓이
	}
	
	public static void getRecArea(int n1, int n2) {
		int res = n1 * n2;
		System.out.println("rec : " + res);
	}
	public static void getRecCirlce(int r) {
		final double PI = 3.14;
		double res = r * r * PI;
		System.out.println("circle : " + res);
		
	}
	public static void getTriangleArea(int n1, int n2) {
		int res = n1 * n2 /2;
		System.out.println("triangle : " + res);
	}







	
}

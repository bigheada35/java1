
public class DMethodCallTest {

	public static void main(String[] args) {
		int num = add(3,7);
		
		System.out.println("---add : " + num);
		
		num = sub(3, 7);
		System.out.println("---sub:"+num);
		num = mul(6,7);
		System.out.println(num);
		num = div(6,0);
		System.out.println("----div by 0  :"+num);
		
		
		startPrint(5);
		System.out.println("----");
		startPrint(3);
		System.out.println("----");
		startPrint(6);		
		System.out.println("----");
		startPrint(7);
		
		double area = getCircleArea(10);
		System.out.println("--cir area : " + area);
		
		
		double width = 100;
		double height = 100;
		double area2 = getRectArea(width, height);
		System.out.println("--rec area:"+ area2);

		
		
		
	}
	
	private static double getRectArea(double width, double height) {
		// TODO Auto-generated method stub
		return width*height;
	}
	private static double getCircleArea(int i) {
		final double PI = 3.14;
		double area = i * i * PI;
		return area;
	}
	/*
	 * 			----3---
				*
				**
				***
				----6---
				*
				**
				***
				****
				*****
				******
				----7---
				*
				**
				***
				****
				*****
				******
				*******
	*
	 */
	private static void startPrint(int col) {
		for(int i=1; i<=col; i++) {
			for(int j=1; j<=i ;j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
	}
	private static int div(int i, int j) {
		if(j == 0)
			return 0;
		
		return (int)(i/(double)j);
	}
	private static int mul(int i, int j) {
		
		return i*j;
	}

	private static int sub(int i, int j) {
		
		return i-j;
	}

	private static int add(int i, int j) {
		
		return i+j;
	}
	

}
